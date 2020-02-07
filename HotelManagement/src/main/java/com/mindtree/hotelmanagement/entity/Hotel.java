package com.mindtree.hotelmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	private String hotelName;
	
	@ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "hotels")
	private List<Dishes> dishes;

	public Hotel() {
		super();
	}

	public Hotel(int hotelId, String hotelName, List<Dishes> dishes) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.dishes = dishes;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public List<Dishes> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dishes> dishes) {
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", dishes=" + dishes + "]";
	}
	
	

}
