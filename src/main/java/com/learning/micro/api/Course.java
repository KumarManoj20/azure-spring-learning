package com.learning.micro.api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Course {
    private long courseID;
    private String courseName;
    private double rating;
}
