package com.meta.springmvc.controller;

import com.meta.springmvc.entity.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello/request")
public class DataRequestController {

    /* =========================
       HTML Form View
       ========================= */

    @GetMapping("/form/html")
    public String form() {
        // resources/templates/hello-request-form.html
        return "hello-request-form";
    }

    /* =========================
       @PathVariable
       ========================= */

    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(
            @PathVariable String name,
            @PathVariable int age
    ) {
        return String.format(
                "Hello, @PathVariable로 받은 데이터값들<br>name = %s, age = %d",
                name,
                age
        );
    }

    /* =========================
       @RequestParam (GET)
       ========================= */

    @GetMapping("/form/param")
    @ResponseBody
    public String helloRequestParam(
            @RequestParam String name,
            @RequestParam int age
    ) {
        return String.format(
                "Hello, @RequestParam으로 받은 값들<br>name = %s, age = %d",
                name,
                age
        );
    }

    /* =========================
       @RequestParam (POST)
       ========================= */

    @PostMapping("/form/param")
    @ResponseBody
    public String helloRequestParamPost(
            @RequestParam String name,
            @RequestParam int age
    ) {
        return String.format(
                "Hello, @RequestParam으로 받은 값들<br>name = %s, age = %d",
                name,
                age
        );
    }

    /* =========================
       @ModelAttribute (HTML form)
       ========================= */

    @PostMapping("/form/model")
    @ResponseBody
    public String helloRequestModel(Star star) {
        return String.format(
                "Hello, @ModelAttribute로 받은 값<br>name = %s, age = %d",
                star.getName(),
                star.getAge()
        );
    }

    /* =========================
       @RequestBody (JSON)
       ========================= */

    @PostMapping("/form/model/json")
    @ResponseBody
    public String helloRequestModelJson(@RequestBody Star star) {
        return String.format(
                "Hello, @RequestBody로 받은 JSON 데이터<br>name = %s, age = %d",
                star.getName(),
                star.getAge()
        );
    }
}
