package com.connect.demo.connectH2demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.connect.demo.connectH2demo.entity.Course;
@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	public List<Course> findAll(){
		TypedQuery<Course> namedQuery = em.createNamedQuery("find_all_courses",Course.class);
		return namedQuery.getResultList();
	}
	
	
	public Course findById(Long i) {
		return em.find(Course.class,i);
	}
	
	public Course save(Course course) {
		if(course.getId()==null) {
			em.persist(course);
		}else {
			em.merge(course);
		}
		return course;
	}
	
	public void deleteById(long id) {
		Course course = findById(id);
		em.remove(course);
	}

	
}
