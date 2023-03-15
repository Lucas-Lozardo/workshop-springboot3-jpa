package com.portfolio_lozardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio_lozardo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
