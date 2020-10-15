package com.brighterbee.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brighterbee.category.model.Category;
import com.brighterbee.category.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> getCategories(){
		return repository.findAll();
	}
	
	public Category saveCategory(Category entity) {
		return repository.save(entity);
	}

}
