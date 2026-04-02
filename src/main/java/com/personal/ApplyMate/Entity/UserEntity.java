package com.personal.ApplyMate.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserEntity {
	
	//I have to implement validations for this Use entity 
	@Id
	private Integer id;
	
	private String name;
	 
	private String emal;

}
