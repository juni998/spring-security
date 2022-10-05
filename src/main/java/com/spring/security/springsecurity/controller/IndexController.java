package com.spring.security.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        // 뷰리졸버 설정 : templates (prefix), .mustache (suffix)
        return "index";
    }
}
