package com.integration.rest.entities.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.integration.rest.entities.product.category.Category;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
	@SequenceGenerator(name = "item_generator", sequenceName = "item_sequence", initialValue = 1, allocationSize = 1)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String name;
	private Integer stockQuantity;
	private Double price;
	private Integer vatValue;
	@ManyToOne
	@JoinColumn(name = "category", updatable = false, nullable = false)
	private Category category;

	public Item() {
		super();
	}

	public Item(String name, Integer stockQuantity, Double price, Integer vatValue, Category category) {
		super();
		this.name = name;
		this.stockQuantity = stockQuantity;
		this.price = price;
		this.vatValue = vatValue;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getVatValue() {
		return vatValue;
	}

	public void setVatValue(Integer vatValue) {
		this.vatValue = vatValue;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
