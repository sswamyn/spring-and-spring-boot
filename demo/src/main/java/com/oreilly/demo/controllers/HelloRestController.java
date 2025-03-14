package com.oreilly.demo.controllers;

import com.oreilly.demo.json.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    @GetMapping("/rest")
    public Greeting greet(@RequestParam(defaultValue = "World") String name) {
        return new Greeting("Hello, %s!".formatted(name));
    }

    @PostMapping("/rest")
    @ResponseStatus(HttpStatus.CREATED)
    public Greeting greetPostBody(@RequestBody Greetinging greeting){
        return new Greeting("Hello, %s!".formatted(greeting.message())) ;
    }

}
