package com.mindtree.hotelmanagement.service;

import java.util.List;

import com.mindtree.hotelmanagement.entity.Dishes;
import com.mindtree.hotelmanagement.entity.Hotel;
import com.mindtree.hotelmanagement.exceptions.ServiceException;

public interface HotelmanagementService {

	public void addHotel(Hotel hotel) throws ServiceException;

	public void addDish(Dishes dish) throws ServiceException;

	public Object getHotels();

	public Object getDishes();

	public void addHotelWithDish(int dishId, int hotelId);

	public void deleteDish(int dishId) throws ServiceException;


	public void updateDish(int dishId, double rating, double price);

	public List<Hotel> viewDetails();


}
