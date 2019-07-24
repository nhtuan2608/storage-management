package spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;

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
public class User {
	@Id
	@NotNull(message = "Not null")
	private String id;
	
	@Size(max = 16, min = 4, message = "{user.password.invalid}")
	@NotNull(message = "Not null")
	private String password;
	
	@Size(max = 20, min = 4, message = "{user.userName.invalid}")
	@NotNull(message = "Not null")
	private String userName;
	private String role;
	public User(String userName2, String password2, List<GrantedAuthority> grantList) {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
