package com.sbrf.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControler {
    @GetMapping("/user")
    public String helloUser(@RequestParam("name") String name,
                            Model model) {
        model.addAttribute("helloString", "Hello, " + name);
        return "hello";
    }
}
