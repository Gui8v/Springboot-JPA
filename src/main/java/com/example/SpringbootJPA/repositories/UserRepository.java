package com.example.SpringbootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
