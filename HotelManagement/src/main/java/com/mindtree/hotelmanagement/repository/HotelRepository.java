package com.mindtree.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hotelmanagement.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
