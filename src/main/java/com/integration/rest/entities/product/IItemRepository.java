package com.integration.rest.entities.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepository extends CrudRepository<Item, Long> {

}