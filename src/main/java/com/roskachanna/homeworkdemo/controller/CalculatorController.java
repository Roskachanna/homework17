package com.roskachanna.homeworkdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String greeting(){
        return "Добро пожаловать в калькулятор";
    }
}
