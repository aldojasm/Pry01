package com.family.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.family.project.entity.Family;
@Repository
public interface FamilyRep extends JpaRepository<Family, Long> {

}
