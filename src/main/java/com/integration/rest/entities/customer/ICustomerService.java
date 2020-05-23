package com.integration.rest.entities.customer;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface ICustomerService extends IEntityService<Customer, Long> {
	public List<Customer> findAllByGender(String gender);
	public Map<String, Long> findCountByGender();
	public Map<String, Long> findCountByCity();
	public Map<String, Long> findCountByCounty();
}
