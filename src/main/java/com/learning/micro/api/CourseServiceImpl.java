package com.learning.micro.api;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl  implements CourseServie {


    @Override
    public List<Course> getAllCourse() {

        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course(1,"Docker and Kubernetes",4.5));
        courses.add(new Course(2,"AZ-204 Azure Developer",4.6));
        courses.add(new Course(3,"'AZ-104 Administrator",4.7));
        return courses;
    }
}
