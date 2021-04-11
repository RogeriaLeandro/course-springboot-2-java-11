package com.rogerialeandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerialeandro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	//por herdar JpaRepository, ela já é uma annotation Repository
}
