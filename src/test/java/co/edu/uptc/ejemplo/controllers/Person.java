package co.edu.uptc.example1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")

public class Person{

    @GetMapping("/persons")
    public void sumar(){
        System.out.println("asdas");
    }
}