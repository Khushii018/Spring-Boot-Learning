package com.Store.Course.controller;

import com.Store.Course.binding.Course;
import com.Store.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CourseControllers {
    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<String>createCourse(@RequestBody Course course){
       String status= courseService.upsert(course);
       return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @GetMapping("/course/{courseId}")
    public ResponseEntity<Course>getCourse(@PathVariable int courseId){
        Course course=courseService.getById(courseId);
        return new ResponseEntity<>(course,HttpStatus.OK);

    }
    @GetMapping("/course")
    public ResponseEntity<List<Course>>getAllCourses(){
        List<Course>allCourses=courseService.getAllCourses();
        return new ResponseEntity<>(allCourses,HttpStatus.OK);

    }
    @PutMapping("/course")
    public ResponseEntity<String>updateCourse(@RequestBody Course course){
        String status =courseService.upsert(course);
        return new ResponseEntity<>(status,HttpStatus.OK);
    }
    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<String>deleteCourse(@PathVariable int courseId){
        String status=courseService.deleteById(courseId);
        return new ResponseEntity<>(status,HttpStatus.OK);
    }

}
