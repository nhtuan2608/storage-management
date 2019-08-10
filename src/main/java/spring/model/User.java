package spring.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @Data đại diện cho get, set và có thể xài cho restAPI
* @AllArgsConstructor đại diện cho mọi constructor
* @NoArgsConstructor đại diện cho constructor rỗng
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-11 
*/
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Transactional
public class User{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	
	@NotNull(message = "Not null")
	private String password;
	
	
	@Size(max = 20, min = 4, message = "{user.userName.invalid}")
	@NotNull(message = "Not null")
	private String userName;
	
//	private boolean enabled;
//	
	@ManyToOne(optional = false)
	@JoinColumn(name ="role_id", nullable = true)
	private Role role;
	
	private int numberOfObject;

//    @Override
//    public String getPassword() {
//        return this.password;
//    }
//    @Override
//    public String getUsername() {
//        return this.userName;
//    }
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//    
//    @Override
//    public boolean isEnabled() {
//        return this.enabled;
//    }
//    @Transient
//    private Collection<? extends GrantedAuthority> grantedAuthorities;
//    
//    @Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return this.grantedAuthorities;
//	}
//	
//	public void setAuthorities(List<GrantedAuthority> grantedList) {
//		this.grantedAuthorities = grantedList;
//	}
}
