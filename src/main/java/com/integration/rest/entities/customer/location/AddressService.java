package com.integration.rest.entities.customer.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private IAddressRepository addressRepository;

	public Optional<Address> findById(Long addressId) {
		return addressRepository.findById(addressId);
	}

	public List<Address> findAll() {
		return (List<Address>) addressRepository.findAll();
	}

	public void insert(Address address) {
		addressRepository.save(address);
	}

	public void update(Address address) {
		addressRepository.save(address);
	}

	public void deleteById(Long addressId) {
		addressRepository.deleteById(addressId);
	}

}
