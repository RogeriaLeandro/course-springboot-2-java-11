package com.rogerialeandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerialeandro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//por herdar JpaRepository, ela já é uma annotation Repository
}
