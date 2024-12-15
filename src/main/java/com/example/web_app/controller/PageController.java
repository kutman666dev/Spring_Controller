package com.example.web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";  // Название файла index.html
    }

    @GetMapping("/page1")
    public String page1() {
        return "page1";  // Название файла page1.html
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2";  // Название файла page2.html
    }
}
