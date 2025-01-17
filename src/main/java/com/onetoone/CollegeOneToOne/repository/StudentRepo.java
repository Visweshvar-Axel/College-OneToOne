package com.onetoone.CollegeOneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.CollegeOneToOne.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
