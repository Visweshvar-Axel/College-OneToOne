package com.onetoone.CollegeOneToOne.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.CollegeOneToOne.entity.College;
import com.onetoone.CollegeOneToOne.entity.Student;
import com.onetoone.CollegeOneToOne.repository.CollegeRepo;
import com.onetoone.CollegeOneToOne.repository.StudentRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CollegeService {
    @Autowired
    CollegeRepo collegeRepo;
    @Autowired
    StudentRepo studentRepo;

    public List<College> getAllCollege() {
        return collegeRepo.findAll();
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public College CreateCollege(College college) {
        return collegeRepo.save(college);
    }

    public Student CreateStudentByCollege(Long collegeId, Student student) {
        Optional<College> college = collegeRepo.findById(collegeId);
        if (college.isPresent()) {
            student.setCollege(college.get());
            college.get().setStudent(student);
            return studentRepo.save(student);
        }
        return null;
        // if (collegeId == null) {
        // throw new IllegalArgumentException("College ID must not be null");
        // }

        // Optional<College> college = collegeRepo.findById(collegeId);
        // if (college.isPresent()) {
        // // Check if the college already has a student
        // if (college.get().getStudent() != null) {
        // throw new IllegalStateException("College already has a student associated.");
        // }
        // // student.setCollege(college.get());
        // college.get().setStudent(student);
        // return studentRepo.save(student);
        // }
        // // Throw an exception or return a specific response if the college is not
        // found
        // throw new EntityNotFoundException("College with ID " + collegeId + " not
        // found");

        // Optional<College> college = collegeRepo.findById(collegeId);
        // if (college.isPresent()) {
        // // Check if the college already has a student
        // if (college.get().getStudent() != null) {
        // // Handle existing student scenario
        // // Either throw an exception or update existing student information
        // // e.g., return null or throw custom exception
        // throw new IllegalStateException("College already has a student associated.");
        // }

        // student.setCollege(college.get());
        // college.get().setStudent(student);
        // return studentRepo.save(student);
        // }
        // return null; // Or throw an exception for not found

    }

}
