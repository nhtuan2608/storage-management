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
public class Export_Note {
	@Id
	private String id;
	
	private String user_id;
	
	private String date;
	
	private String status;
	
	private int numberOfObject;
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getNumberOfObject() {
		return numberOfObject;
	}

	public void setNumberOfObject(int numberOfObject) {
		this.numberOfObject = numberOfObject;
	}


	
}
