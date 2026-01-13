package com.meta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {

    private static long visitCount = 0;

    // static 리소스 redirect
    @GetMapping("/static-hello")
    public String staticHello() {
        return "redirect:/hello.html";
    }

    @GetMapping("/html/redirect")
    public String redirectTest() {
        return "redirect:/static-hello";
    }

    // templates/hello-template.html
    @GetMapping("/templates")
    public String templateHello() {
        return "hello-template";
    }

    // templates/hello-dynamic.html
    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-dynamic";
    }

}
