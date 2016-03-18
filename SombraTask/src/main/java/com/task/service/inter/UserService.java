package com.task.service.inter;

import java.util.List;

import com.task.model.User;

public interface UserService {
	
	void save(User user);
	void update(User user);
	void delete(User user);
	User findById(Integer id);
	List<User> findAllUsers();
	
}
