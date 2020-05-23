package com.integration.rest.entities.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService implements IItemService {

	@Autowired
	private IItemRepository itemRepository;

	public Optional<Item> findById(Long itemId) {
		return itemRepository.findById(itemId);
	}

	public List<Item> findAll() {
		return (List<Item>) itemRepository.findAll();
	}

	public void insert(Item item) {
		itemRepository.save(item);
	}

	public void update(Item item) {
		itemRepository.save(item);
	}

	public void deleteById(Long itemId) {
		itemRepository.deleteById(itemId);
	}

}
