package com.task.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.model.User;
import com.task.repository.AbstractDAO;
import com.task.repository.inter.UserDAO;

@Repository
@Transactional
public class UserDAOImpl extends AbstractDAO<User, Integer> implements UserDAO{
	
	public List<User> findAllUsers() {
		return findAll(User.class);
	}
	
}
