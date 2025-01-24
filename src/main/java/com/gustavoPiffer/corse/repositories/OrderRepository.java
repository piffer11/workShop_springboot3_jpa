package com.gustavoPiffer.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoPiffer.corse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
