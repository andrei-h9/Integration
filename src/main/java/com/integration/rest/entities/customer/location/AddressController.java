package com.integration.rest.entities.customer.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/address")
public class AddressController implements IEntityController<Address, Long> {

	@Autowired
	private IAddressService addressService;

	public Optional<Address> findById(@PathVariable("id") Long addressId) {
		return addressService.findById(addressId);
	}

	public List<Address> getAll() {
		return addressService.findAll();
	}

	public void insert(@RequestBody Address address) {
		addressService.insert(address);
	}

	public void update(@RequestBody Address address) {
		addressService.update(address);
	}

	public void delete(@PathVariable("id") Long addressId) {
		addressService.deleteById(addressId);
	}

}
