package com.example.SpringbootJPA.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootJPA.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public  ResponseEntity<User> findAll(){
			User u = new User(8l, "Jão", "jao@gmail.com", "999999999", "batatinha123");
			return ResponseEntity.ok().body(u);
	}
}
