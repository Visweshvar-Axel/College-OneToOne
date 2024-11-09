package com.onetoone.CollegeOneToOne.entity;

import jakarta.persistence.*;

@Entity
public class College {
    @Id
    @GeneratedValue
    Long id;
    String name;
    // @OneToOne(mappedBy = "college")
    @OneToOne
    Student student;

    public College() {
    }

    public College(Long id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
