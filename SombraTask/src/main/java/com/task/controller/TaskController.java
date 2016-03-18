package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.model.Message;
import com.task.model.Movie;
import com.task.service.inter.MovieService;

@RestController
public class TaskController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/hello/{player}", method=RequestMethod.GET)
	public Message messaging(@PathVariable String player) {
		Message msg = new Message(player, "Hello, " + player );
		return msg;
	}
	
	@RequestMapping(value="/task0users", method=RequestMethod.GET)
	public List<Movie> getAllMovies() {
		return movieService.findAllMovies();
	}
	
}
