package spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.resource.GzipResourceResolver;
import org.springframework.web.servlet.resource.PathResourceResolver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.ui.context.support.ResourceBundleThemeSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

import spring.validator.dropBoxValidator;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "spring")
public class WebMVCConfig implements WebMvcConfigurer {
	
	@Bean(name = "viewResolver")
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		return tilesViewResolver;
	}

	@Bean(name = "tilesConfigurer")
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] { "/WEB-INF/tiles.xml" });
		return tiles;

	}
	
	@Bean
	public CharacterEncodingFilter filter() {
		CharacterEncodingFilter cef = new CharacterEncodingFilter();
		cef.setBeanName("encoding");
		cef.setEncoding("UTF-8");
		cef.setForceEncoding(true);
		return cef;
	}
	
	@Bean
	public dropBoxValidator dropBoxValidator() {
		return new dropBoxValidator();
	}
	
   @Bean
   public InternalResourceViewResolver resolver() {
      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
      resolver.setViewClass(JstlView.class);
      resolver.setPrefix("/WEB-INF/Views/");
      resolver.setSuffix(".jsp");
      return resolver;
   }
 
   @Bean
   public MessageSource messageSource() {
      ResourceBundleMessageSource source = new ResourceBundleMessageSource();
      source.setBasename("messages");
      return source;
   }
 
   @Bean
   public Validator getValidator() {
      LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
      validator.setValidationMessageSource(messageSource());
      return validator;
   }
   
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
	   registry
	      .addResourceHandler("/js/**")
	      .addResourceLocations("classpath:/statics/js/")
	      .setCachePeriod(3600)
	      .resourceChain(true)
	      .addResolver(new GzipResourceResolver())
	      .addResolver(new PathResourceResolver());
	   registry
	   	.addResourceHandler("/css/**")
	   	.addResourceLocations("classpath:/statics/css/")
	      .setCachePeriod(3600)
	      .resourceChain(true)
	      .addResolver(new PathResourceResolver());
	   registry
	   	.addResourceHandler("/fonts/**")
	   	.addResourceLocations("classpath:/statics/fonts/")
	      .setCachePeriod(3600)
	      .resourceChain(true)
	      .addResolver(new PathResourceResolver());
	   registry
	   	.addResourceHandler("/vendor/**")
	   	.addResourceLocations("classpath:/statics/vendor/")
	      .setCachePeriod(3600)
	      .resourceChain(true)
	      .addResolver(new PathResourceResolver());

	   registry.addResourceHandler("/img/**").addResourceLocations("classpath:/statics/img/")
       .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
   }
   
   @Bean
   public ResourceBundleThemeSource themeSource() {
       ResourceBundleThemeSource themeSource
         = new ResourceBundleThemeSource();
       themeSource.setDefaultEncoding("UTF-8");
       themeSource.setBasenamePrefix("themes.");
       return themeSource;
   }
   
   @Override
   public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
       Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
       builder.indentOutput(true);
       converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
   } 
   
}
