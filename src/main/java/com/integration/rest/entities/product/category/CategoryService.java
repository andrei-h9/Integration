package com.integration.rest.entities.product.category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategoryRepository categoryRepository;

	public Optional<Category> findById(Long categoryId) {
		return categoryRepository.findById(categoryId);
	}

	public List<Category> findAll() {
		return (List<Category>) categoryRepository.findAll();
	}

	public void insert(Category category) {
		categoryRepository.save(category);
	}

	public void update(Category category) {
		categoryRepository.save(category);
	}

	public void deleteById(Long categoryId) {
		categoryRepository.deleteById(categoryId);
	}

}
