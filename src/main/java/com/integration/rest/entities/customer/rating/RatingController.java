package com.integration.rest.entities.customer.rating;

import java.util.List;
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
@RequestMapping("/rating")
public class RatingController implements IEntityController<Rating, Long> {

	@Autowired
	private IRatingService ratingService;

	public Optional<Rating> findById(@PathVariable("id") Long ratingId) {
		return ratingService.findById(ratingId);
	}

	public List<Rating> getAll() {
		return ratingService.findAll();
	}

	public void insert(@RequestBody Rating rating) {
		ratingService.insert(rating);
	}

	public void update(@RequestBody Rating rating) {
		ratingService.update(rating);
	}

	public void delete(@PathVariable("id") Long ratingId) {
		ratingService.deleteById(ratingId);
	}
	
	@RequestMapping(value = "/all/stars/item/{itemId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getAllStarsByItemId(@PathVariable("itemId") Long itemId) {
		return ratingService.findAllStarsByItemId(itemId);
	}
	
	@RequestMapping(value = "/average/stars/item/{itemId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Double getAverageStarsByItemId(@PathVariable("itemId") Long itemId) {
		return ratingService.findAverageStarsByItemId(itemId);
	}
	
	@RequestMapping(value = "/all/stars/category/{categoryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getAllStarsByCategoryId(@PathVariable("categoryId") Long categoryId) {
		return ratingService.findAllStarsByCategoryId(categoryId);
	}
	
	@RequestMapping(value = "/average/stars/category/{categoryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Double getAverageStarsByCategoryId(@PathVariable("categoryId") Long categoryId) {
		return ratingService.findAverageStarsByCategoryId(categoryId);
	}

}
