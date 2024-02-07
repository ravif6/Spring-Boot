package com.SpringDemo.tutorial.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //    @RequestMapping(value = "/" , method = RequestMethod.GET)

    @Value("${config.message}")
    private  String message;
    @GetMapping("/ravi")
    public String HelloWorld() {
        return message;
    }
}
