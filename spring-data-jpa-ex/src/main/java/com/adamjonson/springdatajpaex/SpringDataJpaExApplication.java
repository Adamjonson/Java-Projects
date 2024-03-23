package com.adamjonson.springdatajpaex;

import com.adamjonson.springdatajpaex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Mario");
		s1.setMarks(75);

		s1.setRollNo(101);
		s1.setName("Mario");
		s1.setMarks(75);

		s1.setRollNo(101);
		s1.setName("Mario");
		s1.setMarks(75);

	}

}
