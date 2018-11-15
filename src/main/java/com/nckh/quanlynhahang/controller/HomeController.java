package com.nckh.quanlynhahang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("")
    public String home(){
        return "home";
    }
}
