package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @RequestMapping("/hi")
    public String testRavi() {
        return "hi, this is ravi, saying hi";
    }

    @RequestMapping()
    public String fallback() {
        return "choose a fallback";
    }

    @RequestMapping("/bye")
    public String byeRavi() {
        return "hi, this is ravi, saying bye";
    }
}
