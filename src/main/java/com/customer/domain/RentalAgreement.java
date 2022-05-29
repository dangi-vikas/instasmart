package com.customer.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "rental_agreement")
public class RentalAgreement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "agreement_number")
	  private String agreementNumber;
	
	@Column(name = "tenure")
	  private Integer tenure;
	
	@Column(name = "booked_date")
	  private Date bookedDate;
	
	@Column(name = "delivery_date")
	  private Date deliveryDate;
	
	@Column(name = "renewal_date")
	  private Date renewalDate;
	
	@Column(name = "expiry_date")
	  private Date expiryDate;
	
	@Column(name = "total_cost")
	  private Double totalCost;
	
	@ManyToOne
	@JoinColumn(name="order_detail_id")
	private OrderDetail orderDetail;
	
	@OneToOne
	@JoinColumn(name="discount_id")
	private Discount discount;
	
	public RentalAgreement( String agreementNumber,OrderDetail orderDetail,Integer tenure, Date bookedDate, Date deliveryDate,
			Date renewalDate, Date expiryDate, Discount discount,Double totalCost) {
		super();
		this.agreementNumber = agreementNumber;
		this.bookedDate = bookedDate;
		this.deliveryDate = deliveryDate;
		this.tenure=tenure;
		this.renewalDate = renewalDate;
		this.expiryDate = expiryDate;
		this.totalCost = totalCost;
		this.discount=discount;
		this.orderDetail = orderDetail;
	}


	public RentalAgreement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public OrderDetail getOrder() {
		return orderDetail;
	}

	public void setOrder(OrderDetail order) {
		this.orderDetail = order;
	}


	public Discount getDiscount() {
		return discount;
	}


	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	

	
}