package com.Store.Course.service;

import com.Store.Course.binding.Course;
import com.Store.Course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepo;
    @Override
    public String upsert(Course course) {
        courseRepo.save(course);
        return "Success";
    }

    @Override
    public Course getById(int courseId) {
        Optional<Course> findById=courseRepo.findById(courseId);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public String deleteById(int courseId) {
        if(courseRepo.existsById(courseId)){
            courseRepo.deleteById(courseId);
            return "Delete";
        }
        return "No record found";
    }
}
