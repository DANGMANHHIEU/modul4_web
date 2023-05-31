package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
@GetMapping("/hello")
    public String greeting(ModelMap map){
    map.addAttribute("msg","HieuLiver");
    return "file";
}
}
