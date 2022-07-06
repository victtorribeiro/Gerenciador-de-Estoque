package github.victtorribeiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Produtos {

    @GetMapping
    public String HelloWorld(){
        return "Hello World";
    }

}
