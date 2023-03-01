package com.portfolio_lozardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio_lozardo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
