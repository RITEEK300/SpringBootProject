package com.project.SpringFristProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringFristProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFristProjectApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setId(29);
		student.setName("Riteek");
		System.out.println(student.getId());
		System.out.println(student.getName());
	}

}
