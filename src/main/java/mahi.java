package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mahi {

    @GetMapping ("/mahi")
    public String getData() {return  "Please book mahi at 10% Discount" ; }
}