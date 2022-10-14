package com.example.SpringbootJPA.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootJPA.entities.Product;
import com.example.SpringbootJPA.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public  ResponseEntity<List<Product>> findAll(){			
		List<Product> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public  ResponseEntity<Product> findAById(@PathVariable Long id){			
		Product user = service.findById(id);		
		return ResponseEntity.ok().body(user);
	}
}
