package com.integration.rest.entities.product.order;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface IOrderService extends IEntityService<OrderX, Long> {
	
}
