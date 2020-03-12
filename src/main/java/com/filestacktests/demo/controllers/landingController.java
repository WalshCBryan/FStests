package com.filestacktests.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class landingController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/")
    public String alsoHome(){
        return "home";
    }

    @GetMapping("/tranformations")
    public String showTransform(){return "transform";}

    @GetMapping("/workflow")
    public String showWorkflow(){return "workflow";}
}