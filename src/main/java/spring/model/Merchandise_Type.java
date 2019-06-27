package spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Merchandise_Type {
	@Id
	private String id;
	
	@NotNull
	@Size(min = 4, max = 20 , message = "{merchandise_type.name.invalid}")
	private String name;
	
	private String media;
	private int numberOfObject; 
}
