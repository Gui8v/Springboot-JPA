package com.example.SpringbootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
