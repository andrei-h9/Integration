package com.integration.rest.entities.product;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface IItemService extends IEntityService<Item, Long> {

}
