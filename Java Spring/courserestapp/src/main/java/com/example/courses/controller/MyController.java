package com.example.courses.controller;

import com.example.courses.entity.*;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return null;
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return null;
    }

    @PostMapping("/courses")
    public Course addCourse() {
        return null;
    }

    @PutMapping("courses")
    public String updateCourse() {
        return "success";
    }

    @DeleteMapping("/courses/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id) {
        try {
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
