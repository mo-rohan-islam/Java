package com.fresco.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrescoCourseController {
    
    @RequestMapping("/fresco")
    public String test() {
        return "Hi! Welcome to Fresco World";
    }
}
