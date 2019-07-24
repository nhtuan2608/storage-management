package spring.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String street;
	private String ward;
	private String district;
	private String city;
	private String country;
	private String postalCode;
}
