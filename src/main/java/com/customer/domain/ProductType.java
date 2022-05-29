package com.customer.domain;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product_type")
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "type")
	private String type;
	@ManyToOne
	@JoinColumn(name="productCategory")
	private ProductCategory product_category;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ProductCategory getProductCategory() {
		return product_category;
	}

	public void setProductCategory(ProductCategory product_category) {
		this.product_category = product_category;
	}

	public ProductType() {
	}

	public ProductType(Integer id, String type, ProductCategory product_category) {
		this.id = id;
		this.type = type;
		this.product_category = product_category;
	}
	
	public ProductType(String type, ProductCategory product_category) {
		this.type = type;
		this.product_category = product_category;
	}
}
