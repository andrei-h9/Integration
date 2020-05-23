package com.integration.rest.entities.product.category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/category")
public class CategoryController implements IEntityController<Category, Long> {

	@Autowired
	private ICategoryService categoryService;

	public Optional<Category> findById(@PathVariable("id") Long categoryId) {
		return categoryService.findById(categoryId);
	}

	public List<Category> getAll() {
		return categoryService.findAll();
	}

	public void insert(@RequestBody Category category) {
		categoryService.insert(category);
	}

	public void update(@RequestBody Category category) {
		categoryService.update(category);
	}

	public void delete(@PathVariable("id") Long categoryId) {
		categoryService.deleteById(categoryId);
	}

}
