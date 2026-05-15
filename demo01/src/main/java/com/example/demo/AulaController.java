package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AulaController {

    @GetMapping
    public  String olaMundo(){
        return "<html> <h1> Ola Mundo </h1> <p> undaia </p> </html>";
    }
}
