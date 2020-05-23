package com.integration.rest.entities.customer.rating;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integration.rest.entities.product.category.Category;
import com.integration.rest.entities.product.category.ICategoryRepository;

@Service
public class RatingService implements IRatingService {

	@Autowired
	private IRatingRepository ratingRepository;
	@Autowired
	private ICategoryRepository categoryRepository;

	public Optional<Rating> findById(Long ratingId) {
		return ratingRepository.findById(ratingId);
	}

	public List<Rating> findAll() {
		return (List<Rating>) ratingRepository.findAll();
	}

	public void insert(Rating rating) {
		ratingRepository.save(rating);
	}

	public void update(Rating rating) {
		ratingRepository.save(rating);
	}

	public void deleteById(Long ratingId) {
		ratingRepository.deleteById(ratingId);
	}

	/* ----- CUSTOM ----- */
	public List<Integer> findAllStarsByItemId(Long itemId) {
		List<Rating> ratings = (List<Rating>) ratingRepository.findAll();
		List<Integer> filteredRatings = new ArrayList<Integer>();

		filteredRatings = ratings.stream().filter(r -> r.getItem().getId().equals(itemId)).map(r -> r.getStars())
				.collect(Collectors.toList());

		return filteredRatings;
	}

	public Double findAverageStarsByItemId(Long itemId) {
		List<Rating> ratings = (List<Rating>) ratingRepository.findAll();
		Double average = ratings.stream().filter(r -> r.getItem().getId().equals(itemId)).mapToDouble(Rating::getStars)
				.average().orElse(Double.NaN);

		return average;
	}

	public List<Integer> findAllStarsByCategoryId(Long categoryId) {
		List<Rating> ratings = (List<Rating>) ratingRepository.findAll();
		List<Category> categories = (List<Category>) categoryRepository.findAll();
		List<Integer> filteredRatings = new ArrayList<Integer>();

		categories.stream().filter(c -> c.getId().equals(categoryId))
				.forEach(c -> ratings.stream().filter(r -> r.getItem().getCategory().getId().equals(c.getId()))
						.forEach(z -> filteredRatings.add(z.getStars())));

		return filteredRatings;
	}

	public Double findAverageStarsByCategoryId(Long categoryId) {
		List<Rating> ratings = (List<Rating>) ratingRepository.findAll();
		Double average = ratings.stream().filter(r -> r.getItem().getCategory().getId().equals(categoryId))
				.mapToDouble(Rating::getStars).average().orElse(Double.NaN);

		return average;
	}

}
