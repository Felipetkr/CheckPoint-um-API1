package com.github.felipetkr.cpum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Nomes")
public class NomesController {

    @GetMapping("/Alexandre")
    public String nome(){
        return ("Alexandre Oliveira");
    }

     @GetMapping("/Lucas")
    public String nome2(){
        return ("Lucas Salles");
    }
}
