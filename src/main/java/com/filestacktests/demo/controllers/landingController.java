package com.filestacktests.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class landingController {
    @GetMapping("/home")
    public String home(){
        return "landing";
    }

    @GetMapping("/tranformations")
    public String home2(){return "transform";}
}