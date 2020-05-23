package com.integration.rest.entities.customer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/customer")
public class CustomerController implements IEntityController<Customer, Long> {

	@Autowired
	private ICustomerService customerService;

	public Optional<Customer> findById(@PathVariable("id") Long customerId) {
		return customerService.findById(customerId);
	}

	public List<Customer> getAll() {
		return customerService.findAll();
	}

	public void insert(@RequestBody Customer customer) {
		customerService.insert(customer);
	}

	public void update(@RequestBody Customer customer) {
		customerService.update(customer);
	}

	public void delete(@PathVariable("id") Long customerId) {
		customerService.deleteById(customerId);
	}

	@RequestMapping(value = "/all/gender/{gender}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllByGender(@PathVariable("gender") String gender) {
		return customerService.findAllByGender(gender);
	}

	@RequestMapping(value = "/count/gender", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Long> getCountByGender() {
		return customerService.findCountByGender();
	}
	
	@RequestMapping(value = "/count/city", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Long> getCountByCity() {
		return customerService.findCountByCity();
	}
	
	@RequestMapping(value = "/count/county", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Long> getCountByCounty() {
		return customerService.findCountByCounty();
	}

}
