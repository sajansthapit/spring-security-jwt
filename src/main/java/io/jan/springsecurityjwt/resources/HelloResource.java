package io.jan.springsecurityjwt.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello World</h1>";
    }
}
