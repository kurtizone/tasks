package com.task.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;





public interface GeneralDao<T, K extends Serializable> {
	
	void create(T entity);
	
	T merge(T entity);
	
	void remove(T entity);
	
	T findOne(Query query);
	
	List<T> findMany(Query query);	
	
	T findById(Class<?> clazz, K id);
	
	List<T> findAll(Class<?> clazz);
	
}
