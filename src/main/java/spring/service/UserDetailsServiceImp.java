package spring.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Role;
import spring.model.User;
import spring.repository.GenericDAO;

@Service
//("userDetailsService")
//@Component
//@Transactional
public class UserDetailsServiceImp implements UserDetailsService {
  private GenericDAO<User> userDao;
  
  private GenericDAO<Role> roleDao;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    User user = userDao.findByName(username);
    
    if (user == null) {
        System.out.println("User not found! " + username);
        throw new UsernameNotFoundException("User " + username + " was not found in the database");
    }

    System.out.println("Found User: " + user);

    // [ROLE_USER, ROLE_ADMIN,..]
    Role role = roleDao.findByName(user.getRole().getName());

    List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
    if (role != null) {
            GrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
            grantList.add(authority);
    }
    return user;
  }
}