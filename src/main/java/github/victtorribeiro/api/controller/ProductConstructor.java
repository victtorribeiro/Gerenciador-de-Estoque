package github.victtorribeiro.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductConstructor {

    @GetMapping
    public String HelloWorld(){
        return "Hello World";
    }

}
