package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/lesson")
public class LessonController {
	
	@GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
	
	@GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Good Evening!";
    }
	
    @GetMapping("/test/{num}")
	@ResponseBody
	public String test(@PathVariable Integer num) {
        return "引数の値 :" + num;
    }
	
}
