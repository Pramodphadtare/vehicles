package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maruti {

    @GetMapping ("/maruti")
    public String getData() {return  "Please book maruti at 10% Discount" ; }
}