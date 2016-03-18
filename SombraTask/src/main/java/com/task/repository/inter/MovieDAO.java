package com.task.repository.inter;

import java.util.List;

import com.task.model.Movie;
import com.task.repository.GeneralDao;

public interface MovieDAO extends GeneralDao<Movie, Integer> {
	List<Movie> findAllMovies();
}
