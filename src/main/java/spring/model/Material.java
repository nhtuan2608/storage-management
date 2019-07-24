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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdTypeMaterial() {
		return idTypeMaterial;
	}
	public void setIdTypeMaterial(String idTypeMaterial) {
		this.idTypeMaterial = idTypeMaterial;
	}
	public String getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(String idSupplier) {
		this.idSupplier = idSupplier;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
