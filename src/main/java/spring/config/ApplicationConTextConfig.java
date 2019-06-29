package spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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


