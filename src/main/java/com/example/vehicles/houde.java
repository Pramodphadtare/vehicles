package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class houde {

    @GetMapping ("/houde")
    public String getData() {return  "Please book houde at 10% Discount" ; }
}