package com.integration.rest.entities.customer.comment;

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
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_generator")
	@SequenceGenerator(name = "comment_generator", sequenceName = "comment_sequence", initialValue = 1, allocationSize = 1)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String text;
	@ManyToOne
	@JoinColumn(name = "customer", updatable = false, nullable = false)
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "item", updatable = false, nullable = false)
	private Item item;
	@ManyToOne(optional = true)
	@JoinColumn(name = "comment", updatable = false, nullable = true)
	private Comment comment;

	public Comment() {
		super();
	}

	public Comment(String text, Customer customer, Item item, Comment comment) {
		super();
		this.text = text;
		this.customer = customer;
		this.item = item;
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

}
