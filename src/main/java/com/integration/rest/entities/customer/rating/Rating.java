package com.integration.rest.entities.customer.rating;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.integration.rest.entities.customer.Customer;
import com.integration.rest.entities.product.Item;

@Entity
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rating_generator")
	@SequenceGenerator(name = "rating_generator", sequenceName = "rating_sequence", initialValue = 1, allocationSize = 1)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private Integer stars;
	@ManyToOne
	@JoinColumn(name = "item", updatable = false, nullable = false)
	private Item item;
	@ManyToOne
	@JoinColumn(name = "customer", updatable = false, nullable = false)
	private Customer customer;

	public Rating() {
		super();
	}

	public Rating(Integer stars, Item item, Customer customer) {
		super();
		this.stars = stars;
		this.item = item;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
