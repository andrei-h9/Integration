package com.integration.rest.entities.product.order.orderline;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineService implements IOrderLineService {

	@Autowired
	private IOrderLineRepository orderLineRepository;

	public Optional<OrderLine> findById(Long orderLineId) {
		return orderLineRepository.findById(orderLineId);
	}

	public List<OrderLine> findAll() {
		return (List<OrderLine>) orderLineRepository.findAll();
	}

	public void insert(OrderLine orderLine) {
		orderLineRepository.save(orderLine);
	}

	public void update(OrderLine orderLine) {
		orderLineRepository.save(orderLine);
	}

	public void deleteById(Long orderLineId) {
		orderLineRepository.deleteById(orderLineId);
	}

}
