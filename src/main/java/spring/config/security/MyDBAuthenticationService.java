//package spring.config.security;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.context.WebApplicationContext;
//
//import spring.model.User;
//import spring.repository.GenericDAO;
//import spring.repository.UserDAO;
//
//
//@Service
////@Component
////@Transactional
//public class MyDBAuthenticationService implements UserDetailsService {
//	@Autowired
//	private UserDAO userDao;
//
//	@Autowired
//    private WebApplicationContext applicationContext;
//
//    public MyDBAuthenticationService() {
//        super();
//    }
//
//    @PostConstruct
//    public void completeSetup() {
//    	userDao = applicationContext.getBean(UserDAO.class);
//    }
//	
//	@Override
//	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//		User user = userDao.findByName(name);
//		System.out.println("User = " + user);
//
//		if (user == null) {
//			throw new UsernameNotFoundException("User " + name + "was not found");
//		}
//
////		String role = user.getRole().getName();
////
////		List<GrantedAuthority> grantList = new ArrayList<>();
////		GrantedAuthority authority = new SimpleGrantedAuthority(role);
////		grantList.add(authority);
////
////		user.setGrantedAuthorities(grantList);
//
//		return new UserPrincipal(user);
//	}
//
//}