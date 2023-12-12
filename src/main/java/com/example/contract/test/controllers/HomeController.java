package com.example.contract.test.controllers;

import com.example.contract.test.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private HomeService service;

    @GetMapping("/home")
    public String home() {
        return service.getWelcomeMessage();
    }

    @GetMapping("/check-if-even")
    public Boolean checkIfEven(@RequestParam Integer number){
        return number % 2 == 0 ? true : false;
    }
}
