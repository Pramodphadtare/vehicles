package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class toyota {

    @GetMapping ("/toyota")
    public String getData() {return  "Please book toyota at 10% Discount" ; }
}