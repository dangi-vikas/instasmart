package com.customer.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "tenure")
	  private Integer tenure;
	
	@Column(name = "percentage")
	  private Integer percentage;
	
	@Column(name = "name")
	  private String name;
	
	public Discount(){}
	
	public Discount(Integer id, Integer tenure, Integer percentage,String name) {
		super();
		this.id = id;
		this.tenure = tenure;
		this.percentage = percentage;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getTenure() {
		return tenure;
	}


	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}


	public Integer getPercentage() {
		return percentage;
	}


	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return String.format("%-15s %-10s %-15s\n", this.getId() , this.getTenure(), this.getPercentage());		
	}
	
}
