package com.rating.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



@Entity
@Table(name =  "user_ratings")
public class Rating {
	
	@Id
	@Column(name = "RatingID")
	private String ratingId;
	
	
	@Column(name = "UserID")
	private String userId;
	
	@Column(name = "HotelID")
	private String hotelId;
	
	@Column(name = "Rating")
	private int rating;
	
	@Column(name = "Feedback")
	private String feedback;
	
	
}
