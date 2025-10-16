package com.autosys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping({"/", "/home"})
    public String index() {
        return "forward:/index.html";
    }
}
