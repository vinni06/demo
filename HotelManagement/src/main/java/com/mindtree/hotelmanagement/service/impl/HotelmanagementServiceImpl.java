package com.mindtree.hotelmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hotelmanagement.entity.Dishes;
import com.mindtree.hotelmanagement.entity.Hotel;
import com.mindtree.hotelmanagement.exceptions.DishNameAlreadyExists;
import com.mindtree.hotelmanagement.exceptions.HotelNameALreadyExists;
import com.mindtree.hotelmanagement.exceptions.NoSuchDishPresent;
import com.mindtree.hotelmanagement.exceptions.ServiceException;
import com.mindtree.hotelmanagement.repository.DishesRepository;
import com.mindtree.hotelmanagement.repository.HotelRepository;
import com.mindtree.hotelmanagement.service.HotelmanagementService;

@Service
public class HotelmanagementServiceImpl implements HotelmanagementService {

	@Autowired
	DishesRepository dishesRepositoryObj;

	@Autowired
	HotelRepository hotelRepositoryObj;

	@Override
	public void addHotel(Hotel hotel) throws ServiceException {
		
		List<Hotel> hotelsList = hotelRepositoryObj.findAll();
		for (Hotel hotels : hotelsList) {
			
			if(hotels.getHotelName().equalsIgnoreCase(hotel.getHotelName()))
			{
				throw new HotelNameALreadyExists("Hotel Name Already present");
			}
			
		}
		hotelRepositoryObj.save(hotel);

	}

	@Override
	public void addDish(Dishes dish) throws ServiceException {
		
		List<Dishes> dishesList=dishesRepositoryObj.findAll();
		for (Dishes dishes : dishesList) {
			
			if(dishes.getDishName().equalsIgnoreCase(dish.getDishName()))
			{
				throw new DishNameAlreadyExists("Dish Name already Exists");
			}
			
			
		}
		dishesRepositoryObj.save(dish);
		
	}

	@Override
	public Object getHotels() {
		return hotelRepositoryObj.findAll();
	}

	@Override
	public Object getDishes() {
		return dishesRepositoryObj.findAll();
	}

	@Override
	public void addHotelWithDish(int dishId, int hotelId) {
	
		Hotel hotels=hotelRepositoryObj.findById(hotelId).get();
		Dishes dish=dishesRepositoryObj.findById(dishId).get();
		dish.getHotels().add(hotels);
		dishesRepositoryObj.save(dish);
		
	}

	@Override
	public void deleteDish(int dishId) throws ServiceException {
		
		dishesRepositoryObj.findById(dishId).orElseThrow(() -> new NoSuchDishPresent("no such Dish present"));
		dishesRepositoryObj.deleteById(dishId);
		
	}

	
	@Override
	public void updateDish(int dishId, double rating, double price) {
	Dishes dishes=dishesRepositoryObj.findById(dishId).get();
	dishes.setRating(rating);
    dishes.setPrice(price);
    
    dishesRepositoryObj.save(dishes);
	}

	@Override
	public List<Hotel> viewDetails() {
		
		return hotelRepositoryObj.findAll();
		
		
	}
	

	

}
