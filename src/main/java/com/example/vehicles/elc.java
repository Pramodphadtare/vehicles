package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ele {

    @GetMapping ("/ele")
    public String getData() {return  "Please book ele at 10% Discount" ; }
}