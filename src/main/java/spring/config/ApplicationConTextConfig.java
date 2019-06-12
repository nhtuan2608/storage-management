package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


public class ApplicationConTextConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	   @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] { HibernateConfig.class };
	   }
	 
	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { WebMVCConfig.class };
	   }
	 
	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }
	}


