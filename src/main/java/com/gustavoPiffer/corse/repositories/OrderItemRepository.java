package com.gustavoPiffer.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gustavoPiffer.corse.entities.OrderItem;
import com.gustavoPiffer.corse.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> { 
}
