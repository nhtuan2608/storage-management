package spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@ComponentScan("spring.*")
@EnableWebSecurity
@Transactional
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	MyUserDetailsService myUserDetailsService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Các User trong Database
		auth.userDetailsService(myUserDetailsService);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		// Các trang không yêu cầu login
		http.authorizeRequests().antMatchers("/login").permitAll();

		// Trang /userInfo yêu cầu phải login với vai trò USER hoặc ADMIN.
		// Nếu chưa login, nó sẽ redirect tới trang /login.
		http.authorizeRequests().antMatchers("/","/addImport","/showAllImportNote").access("hasAnyRole('ROLE_USER','ROLE_ADMIN')");

		// Trang chỉ dành cho ADMIN

		// http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_ADMIN')"
		// );

		// Khi người dùng đã login, với vai trò XX.
		// Nhưng truy cập vào trang yêu cầu vai trò YY,
		// Ngoại lệ AccessDeniedException sẽ ném ra.

		// http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		// Cấu hình cho Login Form.
		http.authorizeRequests()
		    .and()
		    .formLogin()
			// Submit URL của trang login
			.loginPage("/login")//
			.loginProcessingUrl("/j_spring_security_check").usernameParameter("username")
			.passwordParameter("password") // Submit URL
			.defaultSuccessUrl("/")//
			.failureUrl("/login?error=true");//
	}

}
