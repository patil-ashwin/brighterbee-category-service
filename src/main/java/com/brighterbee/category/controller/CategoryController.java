package com.brighterbee.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brighterbee.category.model.Category;
import com.brighterbee.category.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public List<Category> getAllCategories(){
		return service.getCategories();
	}
	
	@PostMapping
	public Category saveCategory(@RequestBody Category category) {
		return service.saveCategory(category);
	}

}
