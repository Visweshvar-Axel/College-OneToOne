package com.onetoone.CollegeOneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.CollegeOneToOne.entity.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, Long> {

}
