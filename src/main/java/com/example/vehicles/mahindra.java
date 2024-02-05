package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mahindra {

    @GetMapping ("/mahindra")
    public String getData() {return  "Please book mahindra at 10% Discount" ; }
}