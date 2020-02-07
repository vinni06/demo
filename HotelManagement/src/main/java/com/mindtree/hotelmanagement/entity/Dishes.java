package com.mindtree.hotelmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Dishes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dishId;
	private String dishName;
	private double rating;
	private double price;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Hotel> hotels;

	public Dishes() {
		super();
	}

	public Dishes(int dishId, String dishName, double rating, double price, List<Hotel> hotels) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.rating = rating;
		this.price = price;
		this.hotels = hotels;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	@Override
	public String toString() {
		return "Dishes [dishId=" + dishId + ", dishName=" + dishName + ", rating=" + rating + ", price=" + price
				+ ", hotels=" + hotels + "]";
	}
	
	

}
