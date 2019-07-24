package spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationConTextConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	   @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] { HibernateConfig.class, WebMVCConfig.class};
	   }
	 
	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return null;
	   }
	 
	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }
	}


