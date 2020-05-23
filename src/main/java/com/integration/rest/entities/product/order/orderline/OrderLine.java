package com.integration.rest.entities.product.order.orderline;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.integration.rest.entities.product.Item;
import com.integration.rest.entities.product.order.OrderX;

@Entity
public class OrderLine {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_line_generator")
	@SequenceGenerator(name = "order_line_generator", sequenceName = "order_line_sequence", initialValue = 1, allocationSize = 1)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private Integer quantity;
	@ManyToOne
	@JoinColumn(name = "item", updatable = false, nullable = false)
	private Item item;
	@JsonIgnoreProperties({"orderLines"})
	@ManyToOne
	@JoinColumn(name = "orderX", updatable = false, nullable = false)
	private OrderX order;

	public OrderLine() {
		super();
	}

	public OrderLine(Integer quantity, Item item, OrderX order) {
		super();
		this.quantity = quantity;
		this.item = item;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public OrderX getOrder() {
		return order;
	}

	public void setOrder(OrderX order) {
		this.order = order;
	}

}
