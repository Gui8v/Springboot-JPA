package com.example.SpringbootJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootJPA.entities.Category;
import com.example.SpringbootJPA.repositories.CategoryRepository;

@Service	
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> user = repository.findById(id);
		return user.get();
	}
}
