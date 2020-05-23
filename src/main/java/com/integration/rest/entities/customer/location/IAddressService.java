package com.integration.rest.entities.customer.location;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface IAddressService extends IEntityService<Address, Long> {

}
