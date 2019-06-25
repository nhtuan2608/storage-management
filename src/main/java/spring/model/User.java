package spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
@AllArgsConstructor()
public class User {
	@Id
	private String id;
	
	@Size(max = 12, min = 4, message = "{user.password.invalid}")
	@NotNull(message = "Not null")
	private String password;
	
	@Size(max = 20, min = 4, message = "{user.userName.invalid}")
	@NotNull(message = "Not null")
	private String userName;
	
	private String role;
	
	private int numberOfObject;
	
	
	
}
