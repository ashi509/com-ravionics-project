package com.ravionics.project.controller;

import com.ravionics.project.entity.College;
import com.ravionics.project.exception.GenericException;
import com.ravionics.project.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
  private CollegeService collegeService;
  @PostMapping("/")
    ResponseEntity<?> addCollege(@Valid @RequestBody College college) throws GenericException{
        return  collegeService.addCollege(college);
    }
    @GetMapping("/")
    ResponseEntity<?> getAllCollege() throws GenericException{
        return collegeService.getAllCollege();
    }
    @GetMapping("/{courseName}")
    ResponseEntity<?> getCollegeByCourseName(@PathVariable String courseName) throws GenericException {
        return collegeService.getCollegeByCourseName(courseName);
    }
}
