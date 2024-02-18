package com.rating.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entities.Rating;
import com.rating.repository.RatingRepository;
import com.rating.services.RatingService;



@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository repository;
	
	@Override
	public Rating create(Rating rating) {
		String randomRatingId = UUID.randomUUID().toString();
		rating.setRatingId(randomRatingId);
		return repository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		
		return repository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserid(String userId) {
		
		return repository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotel(String hotelId) {
		
		return repository.findByHotelId(hotelId);
	}

	
}
