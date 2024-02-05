package com.example.vehicles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ole {

    @GetMapping ("/ole")
    public String getData() {return  "Please book ole at 30% Discount" ; }
}