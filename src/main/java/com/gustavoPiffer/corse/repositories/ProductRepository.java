package com.gustavoPiffer.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoPiffer.corse.entities.enums.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
