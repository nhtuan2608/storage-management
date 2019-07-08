package spring.config.security;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import spring.service.MyDBAuthenticationService;

@EnableWebSecurity
@Configuration
public class WebMVCSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Bean
	public UserDetailsService userDetailsService() {
		return super.userDetailsService();
	}

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder).withUser("user")
				.password(passwordEncoder.encode("123456")).roles("USER").and().withUser("admin")
				.password(passwordEncoder.encode("123456")).roles("USER", "ADMIN");
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		auth.userDetailsService(userDetailsService);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();
		// Các trang không yêu cầu login
		http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll().antMatchers("/resources/**")
				.permitAll().anyRequest().permitAll().antMatchers("/*.css", "/*.jpg").permitAll().anyRequest()
				.permitAll().antMatchers("/css/**", "/js/**", "/img/**", "/webjars/**", "**/favicon.ico", "/index")
				.permitAll().anyRequest().permitAll();
//		.antMatchers("/**")
//			.hasAnyRole("ADMIN", "USER");

		// Trang /userInfo yêu cầu phải login với vai trò USER hoặc ADMIN.
		// Nếu chưa login, nó sẽ redirect tới trang /login.
		http.authorizeRequests().antMatchers("/showUser").access("hasAnyRole('ADMIN')");

		// For ADMIN only.
		// Trang chỉ dành cho ADMIN
		http.authorizeRequests().antMatchers("/admin").access("hasRole('ADMIN')");

		// Khi người dùng đã login, với vai trò XX.
		// Nhưng truy cập vào trang yêu cầu vai trò YY,
		// Ngoại lệ AccessDeniedException sẽ ném ra.
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		// Cấu hình cho Login Form.
//		http.authorizeRequests().and().formLogin()//

		// Submit URL của trang login
//				.loginProcessingUrl("/j_spring_security_check") // Submit URL
//				.loginPage("/login").loginProcessingUrl("/login").defaultSuccessUrl("/")//
//				.failureUrl("/login?error=true")
//				// Cấu hình cho Logout Page.
//				.and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
		http.authorizeRequests().and().formLogin()//
        // Submit URL của trang login
        .loginProcessingUrl("/login") // Submit URL
        .loginPage("/login")//
        .defaultSuccessUrl("/")//
        .failureUrl("/403")//
        .usernameParameter("username")//
        .passwordParameter("password")
        // Cấu hình cho Logout Page.
        .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logout");
	}
}
