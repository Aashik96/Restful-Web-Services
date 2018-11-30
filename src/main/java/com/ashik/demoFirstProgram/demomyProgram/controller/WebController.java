package com.ashik.demoFirstProgram.demomyProgram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "index";
    }
}
