package com.homefood.ours_kitchen.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    private String getHome() {
        return "Welcome to Our's Kitchen Home Page";
    }

    @GetMapping("/contact")
    private String getContact() {
        return "Welcome to Our's Kitchen Contact Page";
    }

    @GetMapping("/about")
    private String getAbout() {
        return "Welcome to Our's Kitchen About Page";
    }
}
