package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bmw {

    @GetMapping ("/bmw")
    public String getData() {return  "Please book bmw at 20% Discount" ; }
}