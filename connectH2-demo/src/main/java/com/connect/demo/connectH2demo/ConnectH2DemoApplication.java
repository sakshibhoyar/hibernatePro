package com.connect.demo.connectH2demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.connect.demo.connectH2demo.entity.Course;
import com.connect.demo.connectH2demo.repository.CourseRepository;

@SpringBootApplication
public class ConnectH2DemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectH2DemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		repository.deleteById(10002);
		repository.save(new Course("Maven in 20 steps"));
		logger.info("all courses -> {}",repository.findAll());
		
		
	}

}
