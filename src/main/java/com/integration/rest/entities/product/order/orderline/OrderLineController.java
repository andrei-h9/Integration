package com.integration.rest.entities.product.order.orderline;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/orderLine")
public class OrderLineController implements IEntityController<OrderLine, Long> {

	@Autowired
	private IOrderLineService orderLineService;

	public Optional<OrderLine> findById(@PathVariable("id") Long orderLineId) {
		return orderLineService.findById(orderLineId);
	}

	public List<OrderLine> getAll() {
		return orderLineService.findAll();
	}

	public void insert(@RequestBody OrderLine orderLine) {
		orderLineService.insert(orderLine);
	}

	public void update(@RequestBody OrderLine orderLine) {
		orderLineService.update(orderLine);
	}

	public void delete(@PathVariable("id") Long orderLineId) {
		orderLineService.deleteById(orderLineId);
	}

}
