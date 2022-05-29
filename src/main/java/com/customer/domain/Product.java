package com.customer.domain;

import javax.persistence.CascadeType;
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
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "image_path")
	private String imagePath;
	
	@ManyToOne()
    @JoinColumn(name="brand_id")
    private Brand brand;

	@ManyToOne()
    @JoinColumn(name="product_type_id")
    private ProductType productType;
	
	@ManyToOne()
    @JoinColumn(name="product_category_id")
    private ProductCategory productCategory;
	
	@ManyToOne()
    @JoinColumn(name="catalog_service_sector_id")
    private CatalogServiceSector catalogServiceSector;
	
	@ManyToOne()
    @JoinColumn(name="catalog_service_area_id")
    private CatalogServiceArea catalogServiceArea;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "dimensions")
	private String dimensions;
	
	@Column(name = "is_visible")
	private Boolean isVisible;
	
	@Column(name = "is_available")
	private Boolean isAvailable;
	
	@ManyToOne()
    @JoinColumn(name="company_id")
    private Company company;
	
	@Column(name = "city")
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_rate_id")
	private ProductRate productRate;
	
	public Product(){}
	

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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public CatalogServiceSector getCatalogServiceSector() {
		return catalogServiceSector;
	}

	public void setCatalogServiceSector(CatalogServiceSector catalogServiceSector) {
		this.catalogServiceSector = catalogServiceSector;
	}

	public CatalogServiceArea getCatalogServiceArea() {
		return catalogServiceArea;
	}

	public void setCatalogServiceArea(CatalogServiceArea catalog_service_area) {
		this.catalogServiceArea = catalogServiceArea;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public Boolean getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
	
	public ProductRate getProductRate() {
		return productRate;
	}

	public void setProductRate(ProductRate productRate) {
		this.productRate = productRate;
	}
}