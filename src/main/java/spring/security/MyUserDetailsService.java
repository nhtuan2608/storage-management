package spring.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import spring.model.Role;
import spring.model.User;
import spring.service.GenericService;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private GenericService<User> userService;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userService.returnUserFindByName(userName);
		System.out.println("User= " + user);
		if (user == null) {

			throw new UsernameNotFoundException("user: was not found in the database");
		}
		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		Role role = user.getRole();
		if (role != null) {
			// ROLE_USER, ROLE_ADMIN
			GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role.getName());
			grantList.add(authority);
		}
		System.out.println("size grantList = " + grantList.size());
		for (GrantedAuthority grantedAuthority : grantList) {
			System.out.println("size grantList user  = " + grantedAuthority.getAuthority());
		}
		UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getUserName(),
				user.getPassword(), grantList);
		System.out.println("UserDetail= " + userDetails);
		return userDetails;
	}

}
