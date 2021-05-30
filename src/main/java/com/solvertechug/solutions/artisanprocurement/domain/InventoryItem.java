package com.solvertechug.solutions.artisanprocurement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory_items")
public class InventoryItem extends BaseModel{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="part_no")
	private String partNo;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_description")
	private String description;
	
	@Column(name="item_link")
	private String webLink;
	
	@Column(name="item_min_price")
	private String minPrice;
	
	@Column(name="max_price")
	private String maxPrice;
	
	@Column(name="default_price")
	private String defaultPrice;
	
	@Column(name="created_by")
	private String creator;
	
	@Column(name="issue_date")
	private String date;
	
	@Column(name="category_id")
	private String categoryId;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(String defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	
	

}
