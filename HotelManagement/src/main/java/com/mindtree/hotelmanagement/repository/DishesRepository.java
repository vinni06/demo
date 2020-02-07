package com.mindtree.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hotelmanagement.entity.Dishes;

@Repository
public interface DishesRepository extends JpaRepository<Dishes, Integer> {

}
