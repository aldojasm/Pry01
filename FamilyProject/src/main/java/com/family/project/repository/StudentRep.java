package com.family.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.family.project.entity.Student;
@Repository
public interface StudentRep extends JpaRepository<Student, Long>{

}
