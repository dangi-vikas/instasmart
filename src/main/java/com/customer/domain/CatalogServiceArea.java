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
@Table(name = "catalog_service_area")
public class CatalogServiceArea{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	@Column(name = "category")
	  private String category;
	
	@ManyToOne
	@JoinColumn(name="catalog_service_sector_id")
	private CatalogServiceSector catalog_service_sector;
	
	
	public CatalogServiceArea(){}
	public CatalogServiceArea(Integer id, String category,CatalogServiceSector catalog_service_sector) {
		super();
		this.id = id;
		this.category = category;
		this.catalog_service_sector = catalog_service_sector;
	}
	

	public CatalogServiceArea(String name,CatalogServiceSector catalog_service_sector, String category) {
		this.category = category;
		this.catalog_service_sector = catalog_service_sector;
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

	public CatalogServiceSector getCatalogServiceSector() {
		return catalog_service_sector;
	}

	public void setCatalogServiceSector(CatalogServiceSector catalog_service_sector) {
		this.catalog_service_sector = catalog_service_sector;
	}
	
}