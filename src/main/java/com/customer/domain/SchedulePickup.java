package com.customer.domain;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule_pickup")
public class SchedulePickup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "pickup_date")
    private Date pickupDate;
	
	@Column(name = "pickup_time")
	private String pickupTime;
	
    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="rental_agreement_id")
	private RentalAgreement rentalAgreement;
	    
	public Integer getId() {
		return id;
	}

	

	public SchedulePickup(Date pickupDate, String pickupTime,
			RentalAgreement rentalAgreement) {
		super();
		this.pickupDate = pickupDate;
		this.pickupTime = pickupTime;
		this.rentalAgreement = rentalAgreement;
	}

	public SchedulePickup() {
		super();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public RentalAgreement getRentalAgreement() {
		return rentalAgreement;
	}

	public void setRentalAgreement(RentalAgreement rentalAgreement) {
		this.rentalAgreement = rentalAgreement;
	}
	
}
