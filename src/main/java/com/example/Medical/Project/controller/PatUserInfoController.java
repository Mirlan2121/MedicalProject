package com.example.Medical.Project.controller;

import com.example.Medical.Project.entity.PatUserInfo;
import com.example.Medical.Project.entity.User;
import com.example.Medical.Project.service.impl.PatUserInfoServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/patuserinfo")
public class PatUserInfoController {
    @Autowired
    private PatUserInfoServiceImpl patUserInfoService;

    @GetMapping
    public String getAllPatUsersInfo(Model model){
        model.addAttribute("log","Вы вошли");

        return "patuserinfo";
    }
}
