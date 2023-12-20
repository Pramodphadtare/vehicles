package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feature {

    @GetMapping ("/feature")
    public String getData() {return  "Please book feature at 10% Discount" ; }
}