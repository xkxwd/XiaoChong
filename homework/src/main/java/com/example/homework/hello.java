package com.example.homework;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloSpringBoot(){
        return "Hello SpringBoot!wait for a night";
    }
}
