package com.integration.rest.entities.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;

	public Optional<Customer> findById(Long customerId) {
		return customerRepository.findById(customerId);
	}

	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	public void insert(Customer customer) {
		customerRepository.save(customer);
	}

	public void update(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteById(Long customerId) {
		customerRepository.deleteById(customerId);
	}

	/* ----- CUSTOM ----- */
	public List<Customer> findAllByGender(String gender) {
		List<Customer> filteredCustomers = new ArrayList<Customer>();
		final String GENDER = gender.toUpperCase();

		if (("M".equals(GENDER)) || ("F".equals(GENDER))) {
			List<Customer> allCustomers = (List<Customer>) customerRepository.findAll();
			filteredCustomers = allCustomers.stream().filter(c -> c.getGender().equals(GENDER))
					.collect(Collectors.toList());
		}

		return filteredCustomers;
	}

	public Map<String, Long> findCountByGender() {
		List<Customer> customers = (List<Customer>) customerRepository.findAll();

		Map<String, Long> counted = customers.stream().map(c -> c.getGender()).collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return counted;
	}
	
	public Map<String, Long> findCountByCity() {
		List<Customer> customers = (List<Customer>) customerRepository.findAll();

		Map<String, Long> counted = customers.stream().map(c -> c.getAddress().getCity().getName()).collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return counted;
	}
	
	public Map<String, Long> findCountByCounty() {
		List<Customer> customers = (List<Customer>) customerRepository.findAll();

		Map<String, Long> counted = customers.stream().map(c -> c.getAddress().getCity().getCounty()).collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return counted;
	}

}
