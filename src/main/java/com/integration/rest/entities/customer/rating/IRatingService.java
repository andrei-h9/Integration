package com.integration.rest.entities.customer.rating;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.integration.rest.entities.IEntityService;

@NoRepositoryBean
public interface IRatingService extends IEntityService<Rating, Long> {
	public List<Integer> findAllStarsByItemId(Long itemId);
	public Double findAverageStarsByItemId(Long itemId);
	public List<Integer> findAllStarsByCategoryId(Long categoryId);
	public Double findAverageStarsByCategoryId(Long categoryId);
}
