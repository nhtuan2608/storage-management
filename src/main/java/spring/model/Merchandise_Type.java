package spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	private String name;
	private String media;
	private int numberOfObject; 
}
