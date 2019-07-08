package spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import spring.model.Address;
import spring.model.Import_Detail_Note;
import spring.model.Import_Note;
import spring.model.Merchandise;
import spring.model.Merchandise_Type;
import spring.model.Role;
import spring.model.Supplier;
import spring.model.User;

 
@Configuration
@EnableTransactionManagement
public class HibernateConfig {
 
    @Autowired
    private ApplicationContext context;
 
    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
        factoryBean.setAnnotatedClasses(User.class);
        factoryBean.setAnnotatedClasses(Merchandise.class);
        factoryBean.setAnnotatedClasses(Merchandise_Type.class);
        factoryBean.setAnnotatedClasses(Supplier.class);
        factoryBean.setAnnotatedClasses(Address.class);
        factoryBean.setAnnotatedClasses(Role.class);
        factoryBean.setAnnotatedClasses(Import_Detail_Note.class);
        factoryBean.setAnnotatedClasses(Import_Note.class);
        return factoryBean;
    }
 
    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
}
