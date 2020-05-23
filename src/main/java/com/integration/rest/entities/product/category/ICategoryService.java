package com.integration.rest.entities.product.category;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface ICategoryService extends IEntityService<Category, Long> {

}
