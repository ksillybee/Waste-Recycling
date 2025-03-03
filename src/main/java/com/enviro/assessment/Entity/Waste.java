package com.enviro.assessment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Waste {
	@Id
	@GeneratedValue
	private int id;
	private String wasteNames;
	private String catergory;
	
	
	public Waste() {
		
	}
	
	
	public Waste(int id, String wasteNames, String catergory) {
		
		this.id = id;
		this.wasteNames = wasteNames;
		this.catergory = catergory;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWasteNames() {
		return wasteNames;
	}
	public void setWasteNames(String wasteNames) {
		this.wasteNames = wasteNames;
	}
	public String getCatergory() {
		return catergory;
	}
	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}
	
	
	

}
