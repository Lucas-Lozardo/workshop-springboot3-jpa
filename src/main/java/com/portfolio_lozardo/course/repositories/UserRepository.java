package com.portfolio_lozardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio_lozardo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
