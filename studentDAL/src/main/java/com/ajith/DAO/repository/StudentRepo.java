package com.ajith.DAO.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajith.DAO.Entity.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {

}
