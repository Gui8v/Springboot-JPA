package com.example.SpringbootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootJPA.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
