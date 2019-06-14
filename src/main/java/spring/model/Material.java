package spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Material {
	@Id
	private String id;
	private String name;
	private String idTypeMaterial;
	private String idSupplier;
	private int Amount;
	private String unit;
	
}
