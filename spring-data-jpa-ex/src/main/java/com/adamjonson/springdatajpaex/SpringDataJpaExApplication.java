package com.adamjonson.springdatajpaex;

import com.adamjonson.springdatajpaex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

/*=		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Mario");
		s1.setMarks(75);

		s2.setRollNo(102);
		s2.setName("Alex");
		s2.setMarks(75);

		s3.setRollNo(103);
		s3.setName("Luigi");
		s3.setMarks(75);

	    repo.save(s2);
		repo.save(s3);*/

		System.out.println(repo.findByMarksGreaterThan(70));
	}

}
