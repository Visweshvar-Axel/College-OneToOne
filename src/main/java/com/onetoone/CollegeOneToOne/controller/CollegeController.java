package com.onetoone.CollegeOneToOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.CollegeOneToOne.entity.College;
import com.onetoone.CollegeOneToOne.entity.Student;
import com.onetoone.CollegeOneToOne.service.CollegeService;

@RestController
public class CollegeController {
    @Autowired
    CollegeService collegeService;

    @GetMapping("/colleges")
    public ResponseEntity<List<College>> getAllCollege() {
        List<College> res = collegeService.getAllCollege();
        return ResponseEntity.ok().body(res);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStuendt() {
        List<Student> res = collegeService.getAllStudents();
        return ResponseEntity.ok().body(res);
    }

    @PostMapping("/colleges")
    public ResponseEntity<College> createCollege(@RequestBody College college) {
        College res = collegeService.CreateCollege(college);
        return ResponseEntity.ok().body(res);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> CreateCollege(@RequestParam Long collegeId, @RequestBody Student student) {
        Student res = collegeService.CreateStudentByCollege(collegeId, student);
        return ResponseEntity.ok().body(res);
    }

}