package com.customer.domain;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "rental_package")
public class RentalPackage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "is_available")
	private Boolean isAvailable;

	@Column(name = "is_visible")
	private Boolean isVisible;

	@Column(name = "created_date")
	private Date created_date;

	@Column(name = "city")
	private String city;

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Column(name = "image_path")
	private String imagePath;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rental_package_rate_id")
	private RentalPackageRate rentalPackageRate;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "rental_package_product", joinColumns = {
			@JoinColumn(name = "package_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	@Fetch(FetchMode.JOIN)
	private List<Product> productList;

	public RentalPackage(String name, Boolean isAvailable, Boolean isVisible, Date created_date, String city,
			String imagePath) {
		super();
		this.name = name;
		this.isAvailable = isAvailable;
		this.isVisible = isVisible;
		this.created_date = created_date;
		this.city = city;
		this.imagePath = imagePath;
		this.rentalPackageRate = rentalPackageRate;
		this.productList = productList;
	}

	public RentalPackage() {
	}

	public RentalPackage(Integer id, String name, Boolean isAvailable, Boolean isVisible, Date created_date,
			String city, RentalPackageRate rentalPackageRate, List<Product> productList) {
		super();
		this.id = id;
		this.name = name;
		this.isAvailable = isAvailable;
		this.isVisible = isVisible;
		this.created_date = created_date;
		this.city = city;
		this.rentalPackageRate = rentalPackageRate;
		this.productList = productList;
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

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Boolean getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public RentalPackageRate getRentalPackageRate() {
		return rentalPackageRate;
	}

	public void setRentalPackageRate(RentalPackageRate rentalPackageRate) {
		this.rentalPackageRate = rentalPackageRate;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-hh");
		return String.format("%-15s %-15s %-15s %-15s\n", this.getName(), sdf.format(this.getCreated_date()),
				this.getCity(), this.getRentalPackageRate().getRate());

	}

}
