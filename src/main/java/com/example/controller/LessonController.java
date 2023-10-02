package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/lesson")
public class LessonController {
    @GetMapping("/sample")
    public String sample(Model model) {
    	String text = "Hello Spring  Boot!!";
    	
    	model.addAttribute("message", text);
    	return "index";
    }
}
