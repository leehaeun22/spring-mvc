package com.meta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {


    @GetMapping("/static-hello")
    public String staticHello() {
        return "redirect:/hello.html";
    }

    @GetMapping("html/redirect")
    public String redirectTest() {
        return "redirect:/static-hello";
    }

    @GetMapping("/templates")
    public String templateHello() {
        return "hello-template";
        // prefix로 컨텍스트 경로(teamplates 폴더가 root)가 붙는다.
        //surfix로 .html 처럼 정적 페이지 확장자가 자동으로 붙는다.
    }
}
