package com.connect.demo.connectH2demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name="find_all_courses",query = "select p from Course p")
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	protected Course() {}
	
	public Course(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\n \n Course [id="+ id + ", name="+name +"]";
	}

	
	

}
