package com.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @RequestMapping("/sayHello.do")
    public String sayHello(){
        System.out.println("helloWorldTest...");
        return "success";
    }
}
