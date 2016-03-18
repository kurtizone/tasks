package com.task.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public abstract class AbstractDAO<T, K extends Serializable> implements GeneralDao<T, K>{
	
	@PersistenceContext
	private EntityManager em;
	
	public void create(T entity) {
		em.persist(entity);		
	}

	public T merge(T entity) {
		return em.merge(entity);
	}

	public void remove(T entity) {
		em.remove(entity);		
	}

	public T findOne(Query query) {
		return (T) query.uniqueResult();
	}

	public List<T> findMany(Query query) {
		return (List<T>) query.list();
	}

	public T findById(Class<?> clazz, K id) {
		return (T) em.find(clazz, id);
	}

	public List<T> findAll(Class<?> clazz) {
		return em.createQuery("select x from " + clazz.getName() + " x").getResultList();
	}
	
	
	
	
}
