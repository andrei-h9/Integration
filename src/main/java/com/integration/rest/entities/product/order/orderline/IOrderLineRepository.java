package com.integration.rest.entities.product.order.orderline;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderLineRepository extends CrudRepository<OrderLine, Long> {

}