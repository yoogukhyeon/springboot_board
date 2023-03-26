package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
