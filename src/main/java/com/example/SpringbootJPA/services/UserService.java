package com.example.SpringbootJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.SpringbootJPA.entities.User;
import com.example.SpringbootJPA.repositories.UserRepository;
import com.example.SpringbootJPA.services.exceptions.DatabaseException;
import com.example.SpringbootJPA.services.exceptions.ResoucerNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ResoucerNotFoundException(id));
	}

	public User insert(User user) {
		return repository.save(user);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);

		} catch (EmptyResultDataAccessException e) {
			throw new ResoucerNotFoundException(id);

		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());

		}

	}

	public User update(Long id, User user) {
		try {
			User entity = repository.getReferenceById(id);
			update(entity, user);
			return repository.save(entity);

		} catch (EntityNotFoundException e) {
			throw new ResoucerNotFoundException(id);
		}
	}

	private void update(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
}
