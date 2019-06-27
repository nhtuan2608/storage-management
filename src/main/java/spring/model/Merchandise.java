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
* @since   2019-06-22
*/

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Merchandise {
	@Id
	private String id;
	
	@NotNull(message = "Not null")
	@Size(min = 3, max = 20, message = "Please  enter name is between 3 and 20 characters")
	private String name;
	
	@NotNull(message = "Not null")
	private String merchandise_type_id;
	
	@NotNull(message = "Not null")
	private String supplier_id;
	
	private int amount;
	private String unit;
	private int numberOfObject;
	
}
