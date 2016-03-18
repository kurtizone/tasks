package com.task.repository.inter;

import java.util.List;

import com.task.model.User;
import com.task.repository.GeneralDao;

public interface UserDAO extends GeneralDao<User, Integer>{
	List<User> findAllUsers();
}
