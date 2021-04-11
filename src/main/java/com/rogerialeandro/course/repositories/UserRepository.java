package com.rogerialeandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerialeandro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
