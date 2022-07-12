package github.victtorribeiro.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductConstructor {

    @GetMapping
    public String HelloWorld(){
        return "Testado";
    }

}
