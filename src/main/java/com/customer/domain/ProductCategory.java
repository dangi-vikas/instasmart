package com.customer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

	
@SuppressWarnings("serial")
@Entity
@Table(name = "product_category")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	@Column(name = "category")
	  private String category;
	
	@ManyToOne
	@JoinColumn(name="catalog_service_area_id")
	private CatalogServiceArea  catalog_service_area;

	public ProductCategory(){}
	public ProductCategory(Integer id, String category) {
		super();
		this.id = id;
		this.category = category;
		
	}
	public ProductCategory(String category) {
		this.category = category;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public CatalogServiceArea getCatalogServiceArea() {
		return catalog_service_area;
	}
	public void setCatalogServiceArea(CatalogServiceArea catalog_service_area) {
		this.catalog_service_area = catalog_service_area;
	}
}
