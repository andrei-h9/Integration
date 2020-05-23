package com.integration.rest.entities.product.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/order")
public class OrderController implements IEntityController<OrderX, Long> {

	@Autowired
	private IOrderService orderService;

	public Optional<OrderX> findById(@PathVariable("id") Long orderId) {
		return orderService.findById(orderId);
	}

	public List<OrderX> getAll() {
		return orderService.findAll();
	}

	public void insert(@RequestBody OrderX order) {
		orderService.insert(order);
	}

	public void update(@RequestBody OrderX order) {
		orderService.update(order);
	}

	public void delete(@PathVariable("id") Long orderId) {
		orderService.deleteById(orderId);
	}

}
