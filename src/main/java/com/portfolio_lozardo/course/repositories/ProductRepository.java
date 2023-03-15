package com.portfolio_lozardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio_lozardo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
