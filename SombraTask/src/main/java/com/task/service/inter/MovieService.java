package com.task.service.inter;

import java.util.List;

import com.task.model.Movie;

public interface MovieService {
	
	void save(Movie movie);
	void update(Movie movie);
	void delete(Movie movie);
	Movie findById(Integer id);
	List<Movie> findAllMovies();
	
}
