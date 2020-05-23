package com.integration.rest.entities.product.order.orderline;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface IOrderLineService extends IEntityService<OrderLine, Long> {
	
}
