package com.github.felipetkr.cpum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("")
public class SobrenomeController {

     @GetMapping("/Felipe")
    public String nome2(){
        return ("Felipe Takara");

    }
}
