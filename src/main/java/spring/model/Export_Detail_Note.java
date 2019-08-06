package spring.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Export_Detail_Note {
	@Id
	private String id;
	
	private String merchandise_id;
	
	private Integer quantity;
	
	private BigDecimal price;
	
	private BigDecimal total;
	
	private String note;
	
	private String export_Note_id;

	private String customer;
	
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerchandise_id() {
		return merchandise_id;
	}

	public void setMerchandise_id(String merchandise_id) {
		this.merchandise_id = merchandise_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getExport_Note_id() {
		return export_Note_id;
	}

	public void setExport_Note_id(String export_Note_id) {
		this.export_Note_id = export_Note_id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
