package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class porshe {

    @GetMapping ("/porshe")
    public String getData() {return  "Please book porshe at 30% Discount" ; }
}