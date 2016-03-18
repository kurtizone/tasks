package com.task.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.model.Rating;
import com.task.repository.AbstractDAO;
import com.task.repository.inter.RatingDAO;

@Repository
@Transactional
public class RatingDAOImpl extends AbstractDAO<Rating, Integer> implements RatingDAO{

	public List<Rating> findAllRatings() {
		return findAll(Rating.class);
	}
	
}
