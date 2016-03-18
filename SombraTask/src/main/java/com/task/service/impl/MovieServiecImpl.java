package com.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.model.Movie;
import com.task.repository.inter.MovieDAO;
import com.task.service.inter.MovieService;

@Service("movieService")
@Transactional
public class MovieServiecImpl implements MovieService{
	
	@Autowired
	MovieDAO movieDAO;
	
	public void save(Movie movie) {
		movieDAO.create(movie);		
	}

	public void update(Movie movie) {
		movieDAO.merge(movie);		
	}

	public void delete(Movie movie) {
		movieDAO.remove(movie);		
	}

	public Movie findById(Integer id) {
		return movieDAO.findById(Movie.class, id);
	}

	public List<Movie> findAllMovies() {
		return movieDAO.findAll(Movie.class);
	}
}
