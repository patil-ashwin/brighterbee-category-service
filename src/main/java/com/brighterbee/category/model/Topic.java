package com.brighterbee.category.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Topic {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;

}
