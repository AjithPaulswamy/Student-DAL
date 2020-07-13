package com.ajith;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ajith.DAO.Entity.Student;
import com.ajith.DAO.repository.StudentRepo;

@SpringBootTest
class StudentDalApplicationTests {

	@Autowired
	StudentRepo studentRepo;
	
	@Test
	void readStudent() {
		Student stud=studentRepo.findById((long) 1).get();
		System.out.println(stud);
	}

}
