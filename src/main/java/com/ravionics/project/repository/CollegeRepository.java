package com.ravionics.project.repository;

import com.ravionics.project.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface CollegeRepository extends JpaRepository<College ,Integer>{
    List<College> findByCourseName(String courseName);
}
