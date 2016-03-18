package com.task.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.model.Movie;
import com.task.repository.AbstractDAO;
import com.task.repository.inter.MovieDAO;

@Repository
@Transactional
public class MovieDAOImpl extends AbstractDAO<Movie, Integer> implements MovieDAO{

	public List<Movie> findAllMovies() {
		return findAll(Movie.class);
	}

}
