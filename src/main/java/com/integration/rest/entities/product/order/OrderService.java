package com.integration.rest.entities.product.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository orderRepository;

	public Optional<OrderX> findById(Long orderId) {
		return orderRepository.findById(orderId);
	}

	public List<OrderX> findAll() {
		return (List<OrderX>) orderRepository.findAll();
	}

	public void insert(OrderX order) {
		orderRepository.save(order);
	}

	public void update(OrderX order) {
		orderRepository.save(order);
	}

	public void deleteById(Long orderId) {
		orderRepository.deleteById(orderId);
	}

}
