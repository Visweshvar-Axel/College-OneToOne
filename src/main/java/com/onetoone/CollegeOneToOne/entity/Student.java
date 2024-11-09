package com.onetoone.CollegeOneToOne.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    Long id;
    String name;
    // @OneToOne
    @OneToOne(mappedBy = "student")
    @JsonIgnore
    College college;

    public Student() {
    }

    public Student(Long id, String name, College college) {
        this.id = id;
        this.name = name;
        this.college = college;
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

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

}
