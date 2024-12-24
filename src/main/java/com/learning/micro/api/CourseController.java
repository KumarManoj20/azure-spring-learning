package com.learning.micro.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allcourselist", courseService.getAllCourse());
        return "index";
    }
}
