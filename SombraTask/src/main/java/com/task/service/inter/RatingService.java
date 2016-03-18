package com.task.service.inter;

import java.util.List;

import com.task.model.Rating;

public interface RatingService {
	
	void save(Rating rating);
	void update(Rating rating);
	void delete(Rating movie);
	Rating findById(Integer id);
	List<Rating> findAllRatings();
	
}
