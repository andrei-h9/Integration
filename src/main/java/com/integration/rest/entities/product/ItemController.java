package com.integration.rest.entities.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.entities.IEntityController;

@RestController
@RequestMapping("/item")
public class ItemController implements IEntityController<Item, Long> {

	@Autowired
	private IItemService itemService;

	public Optional<Item> findById(@PathVariable("id") Long itemId) {
		return itemService.findById(itemId);
	}

	public List<Item> getAll() {
		return itemService.findAll();
	}

	public void insert(@RequestBody Item item) {
		itemService.insert(item);
	}

	public void update(@RequestBody Item item) {
		itemService.update(item);
	}

	public void delete(@PathVariable("id") Long itemId) {
		itemService.deleteById(itemId);
	}

}
