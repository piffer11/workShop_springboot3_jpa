package com.gustavoPiffer.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoPiffer.corse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
