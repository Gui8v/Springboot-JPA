package com.example.SpringbootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootJPA.entities.Category;
import com.example.SpringbootJPA.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
