package com.mindtree.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.hotelmanagement.entity.Dishes;
import com.mindtree.hotelmanagement.entity.Hotel;
import com.mindtree.hotelmanagement.exceptions.HotelmanagementException;
import com.mindtree.hotelmanagement.exceptions.ServiceException;
import com.mindtree.hotelmanagement.service.HotelmanagementService;

@Controller
public class AppController {
	
	@Autowired
	HotelmanagementService hotelmanagementServiceObj;
	
	Dishes d=new Dishes();
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/addhotel")
	public String addBank() {
		return "addhotel";
	}

	@RequestMapping("/submitdetails")
	public String submitBank(Hotel hotel) throws HotelmanagementException  {
		
		try {
			hotelmanagementServiceObj.addHotel(hotel);
		} catch (ServiceException e) {
			throw new HotelmanagementException(e.getMessage());
		}
		
		return "index";
	}
	@RequestMapping("/adddish")
	public String addDish() {
		return "adddish";

	}

	@RequestMapping("/submitdish")
	public String submitDish(Dishes dish) throws HotelmanagementException {
		try {
			hotelmanagementServiceObj.addDish(dish);
		} catch (ServiceException e) {
			throw new HotelmanagementException(e.getMessage());
		}
		return "index";
	}
	@RequestMapping("/link")
	public String getDishesAndHotels(Model model) {
		model.addAttribute("hotels", hotelmanagementServiceObj.getHotels());
		model.addAttribute("dishes", hotelmanagementServiceObj.getDishes());
		return "linkdishhotel";

	}

	@RequestMapping("/addHotelDish")
	public String addHotelWithDish(@RequestParam int dishId, @RequestParam int hotelId) {
		hotelmanagementServiceObj.addHotelWithDish(dishId, hotelId);
		return "index";
	}
	@RequestMapping("/delete")
	public String deleteDish() {
		return "deletedish";
	}
	@RequestMapping("/deletedishes")
	public String deleteUsers(@RequestParam int dishId) throws HotelmanagementException   {
		try {
			hotelmanagementServiceObj.deleteDish(dishId);
		} catch (ServiceException e) {
			throw new HotelmanagementException(e.getMessage());
		}
		return "index";
	
	}
	
	@RequestMapping("/update")
	public String update(Model model)
	{
		model.addAttribute("dish", hotelmanagementServiceObj.getDishes());
		return "update";
	}

	@RequestMapping("/updatedish")
	public String updateDishes(Model model,@RequestParam int dishId,@RequestParam double rating,@RequestParam double price)
	{
		hotelmanagementServiceObj.updateDish(dishId,rating,price);
		return "index";
	}
	
	
	@RequestMapping("/viewdetails")
	public String viewDetails(Model model)
	{
		model.addAttribute("details", hotelmanagementServiceObj.viewDetails());
		
		
		
		
		return "view";
	}

}
