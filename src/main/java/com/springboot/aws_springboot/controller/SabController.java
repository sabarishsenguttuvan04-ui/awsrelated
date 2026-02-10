package com.springboot.aws_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SabController {

    @GetMapping("/getValue")
    public String getString(){
        return "This is for AWS Related";
    }
}
