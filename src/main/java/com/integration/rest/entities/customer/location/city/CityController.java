package com.integration.rest.entities.customer.location.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/city")
public class CityController implements IEntityController<City, Long> {

	@Autowired
	private ICityService cityService;

	public Optional<City> findById(@PathVariable("id") Long cityId) {
		return cityService.findById(cityId);
	}

	public List<City> getAll() {
		return cityService.findAll();
	}

	public void insert(@RequestBody City city) {
		cityService.insert(city);
	}

	public void update(@RequestBody City city) {
		cityService.update(city);
	}

	public void delete(@PathVariable("id") Long cityId) {
		cityService.deleteById(cityId);
	}

}
