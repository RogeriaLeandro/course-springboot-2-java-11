package com.rogerialeandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerialeandro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	//por herdar JpaRepository, ela já é uma annotation Repository
}
