package com.gustavoPiffer.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoPiffer.corse.entities.enums.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
