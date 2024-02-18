package com.rating.services;

import java.util.List;

import com.rating.entities.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating rating);
	
	
	//get all ratings
	List<Rating> getRatings();
	
	
	//get all by userId
	List<Rating> getRatingByUserid(String userId);
	
	
	//get all by hotel
	List<Rating> getRatingByHotel(String hotelId);
	
}
