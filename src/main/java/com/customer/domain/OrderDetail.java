package com.customer.domain;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "order_detail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "name")
	  private String name;
	
	@Column(name = "contact_no")
	  private String contactNo;
	
	@Column(name = "ordered_date")
	  private Date orderedDate;
	
	@Column(name = "delivery_date")
	  private Date deliveryDate;
	
	@Column(name = "delivery_time")
	  private String deliveryTime;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(name = "cost_per_month")
	  private Integer costPerMonth;
	
	 @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE})
	 @JoinTable(name = "order_detail_product",
	  		joinColumns = { @JoinColumn(name = "order_detail_id") },
	  		inverseJoinColumns = { @JoinColumn(name = "product_id") })
	private List<Product> productList = new ArrayList<Product>();


	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE})
	 @JoinTable(name = "order_detail_package",
	  		joinColumns = { @JoinColumn(name = "order_detail_id") },
	  		inverseJoinColumns = { @JoinColumn(name = "package_id") })
	 private List<RentalPackage> rentalPackageList = new ArrayList<RentalPackage>();
	 
	@ManyToOne
	private User user;
	
	 public OrderDetail(){}
	 
	public OrderDetail(Integer id, String name, String contactNo, Date orderedDate, Date deliveryDate, String deliveryTime,
			Address address, Integer costPerMonth,  List<Product> productList,
			List<RentalPackage> rentalPackageList) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.orderedDate = orderedDate;
		this.deliveryDate = deliveryDate;
		this.deliveryTime = deliveryTime;
		this.address = address;
		this.costPerMonth = costPerMonth;
		this.productList = productList;
		this.rentalPackageList = rentalPackageList;
	}
	
	public OrderDetail(String name,  Date orderedDate, Date deliveryDate, String deliveryTime,
			Address address, Integer costPerMonth,  List<Product> productList,
			List<RentalPackage> rentalPackageList) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.orderedDate = orderedDate;
		this.deliveryDate = deliveryDate;
		this.deliveryTime = deliveryTime;
		this.address = address;
		this.costPerMonth = costPerMonth;
		this.productList = productList;
		this.rentalPackageList = rentalPackageList;
	}
	
	public OrderDetail(Date orderedDate, Integer costPerMonth, List<Product> productList) {
		super();
		this.orderedDate = orderedDate;
		this.costPerMonth = costPerMonth;
		this.productList = productList;
	}
 

	public OrderDetail(Date orderedDate, List<RentalPackage> rentalPackageList, Integer costPerMonth) {
		this.orderedDate = orderedDate;
		this.costPerMonth = costPerMonth;
		this.rentalPackageList = rentalPackageList;
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


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public Date getOrderedDate() {
		return orderedDate;
	}


	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}


	public Date getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public String getDeliveryTime() {
		return deliveryTime;
	}


	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Integer getCostPerMonth() {
		return costPerMonth;
	}


	public void setCostPerMonth(Integer costPerMonth) {
		this.costPerMonth = costPerMonth;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public List<RentalPackage> getRentalPackageList() {
		return rentalPackageList;
	}


	public void setRentalPackageList(List<RentalPackage> rentalPackageList) {
		this.rentalPackageList = rentalPackageList;
	}
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
}
