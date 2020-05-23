package com.integration.rest.entities.customer.location.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

	@Autowired
	private ICityRepository cityRepository;

	public Optional<City> findById(Long cityId) {
		return cityRepository.findById(cityId);
	}

	public List<City> findAll() {
		return (List<City>) cityRepository.findAll();
	}

	public void insert(City city) {
		cityRepository.save(city);
	}

	public void update(City city) {
		cityRepository.save(city);
	}

	public void deleteById(Long cityId) {
		cityRepository.deleteById(cityId);
	}

}
