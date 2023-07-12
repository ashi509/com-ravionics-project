package com.ravionics.project.service.impl;

import com.ravionics.project.entity.College;
import com.ravionics.project.exception.GenericException;
import com.ravionics.project.repository.CollegeRepository;
import com.ravionics.project.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;
    @Override
    public ResponseEntity<?> addCollege(College college) throws GenericException {
       college.setId(0);
       var colleges=collegeRepository.save(college);
       if(colleges==null)
           throw new GenericException(HttpStatus.BAD_GATEWAY.value(), "Something went wrong college not save");
       return ResponseEntity.status(HttpStatus.CREATED).body(colleges);
    }

    @Override
    public ResponseEntity<?> getAllCollege() throws GenericException {
        var college=collegeRepository.findAll();
        if(college.isEmpty())
            throw new GenericException(HttpStatus.NO_CONTENT.value(), "No any college");
        return ResponseEntity.ok(college);
    }

    @Override
    public ResponseEntity<?> getCollegeByCourseName(String courseName) throws GenericException {
        var college=collegeRepository.findByCourseName(courseName);
        if(college.isEmpty())
            throw new GenericException(HttpStatus.NOT_FOUND.value(),
                    "College not found with given course name " +courseName);
        return ResponseEntity.ok(college);
    }
}
