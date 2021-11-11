package com.itacademi.medicalcard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MenuController {
    @GetMapping("/")
    public String start(Model model){

        model.addAttribute("menu", " Проэкт медецинская книга");

        return "menu";
    }
}
