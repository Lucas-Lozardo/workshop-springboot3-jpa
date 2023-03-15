package com.portfolio_lozardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio_lozardo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
