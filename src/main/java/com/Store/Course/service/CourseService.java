package com.Store.Course.service;

import com.Store.Course.binding.Course;

import java.util.List;

public interface CourseService {
    public  String upsert(Course course);
    public Course getById(int courseId);
    public List<Course> getAllCourses();
    public String deleteById(int courseId);

}
