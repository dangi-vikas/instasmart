package com.customer.domain;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product_rate")
public class ProductRate{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "rate")
	private Double rate;
	
	public ProductRate(){}
	public ProductRate(Integer id, Date startDate, Date endDate, Double rate) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rate = rate;
	}
	
	public ProductRate( Date startDate, Date endDate, Double rate) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.rate = rate;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}


	
}

