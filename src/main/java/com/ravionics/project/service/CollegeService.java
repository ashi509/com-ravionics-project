package com.ravionics.project.service;

import com.ravionics.project.entity.College;
import com.ravionics.project.exception.GenericException;
import org.springframework.http.ResponseEntity;

public interface CollegeService {
    ResponseEntity<?> addCollege(College college) throws GenericException;
    ResponseEntity<?> getAllCollege() throws GenericException;
     ResponseEntity<?> getCollegeByCourseName(String courseName) throws GenericException;
}
