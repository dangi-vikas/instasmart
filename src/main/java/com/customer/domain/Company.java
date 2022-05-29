package com.customer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
@SuppressWarnings("serial")
@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "name")
	  private String name;
	
	@Column(name = "address")
	  private String address;
	
	
	public Company(){}
	public Company(Integer id, String name,String address) {
		super();
		this.id = id;
		this.name = name;
		this.address =  address;
		
	}
	public Company(String name,String address) {
		this.name = name;
		this.address =  address;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}