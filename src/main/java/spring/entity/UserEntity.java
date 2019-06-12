package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
	private String id;
	private String password;
	private String userName;
	private String role;
		
}
