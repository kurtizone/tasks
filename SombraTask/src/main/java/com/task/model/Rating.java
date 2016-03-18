package com.task.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rating")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer userId;
	
	private Integer movieId;
	
	private Integer rating;
	
	private Date ratingDate;

	public Rating(Integer id, Integer userId, Integer movieId, Integer rating, Date ratingDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.ratingDate = ratingDate;
	}
	
}
