package com.meta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello/request")
public class DataRequestController {


    @GetMapping("/form/html")
    public String form() {
        // resources/templates/hello-request-form.html
        return "hello-request-form";
    }
    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(
            @PathVariable String name,
            @PathVariable int age
    ) {
        return String.format("Hello, @PathValiable로 받으 데이터값들, <br> name = %s, age = %d");
    }



    }


}
