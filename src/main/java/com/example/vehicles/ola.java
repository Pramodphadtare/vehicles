package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ola {

    @GetMapping ("/ola")
    public String getData() {return  "Please book ola at 42% Discount" ; }
}