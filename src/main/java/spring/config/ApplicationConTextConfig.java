//package spring.config;
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import spring.config.security.WebMVCSecurityConfig;
//
//public class ApplicationConTextConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
//	   @Override
//	   protected Class<?>[] getRootConfigClasses() {
//	      return new Class[] { HibernateConfig.class , WebMVCSecurityConfig.class };
//	   }
//	 
//	   @Override
//	   protected Class<?>[] getServletConfigClasses() {
//	      return new Class[] { WebMVCConfig.class };
//	   }
//	 
//	   @Override
//	   protected String[] getServletMappings() {
//	      return new String[] { "/" };
//	   }
//	   
//	}
//
//
