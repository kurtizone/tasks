package com.task.repository.inter;

import java.util.List;

import com.task.model.Rating;
import com.task.repository.GeneralDao;

public interface RatingDAO extends GeneralDao<Rating, Integer>{
	List<Rating> findAllRatings();
}
