package com.example.Medical.Project.controller;

import com.example.Medical.Project.entity.PatUserInfo;
import com.example.Medical.Project.entity.User;
import com.example.Medical.Project.service.impl.PatUserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/patUserinfo")
public class PatUserInfoController {
    @Autowired
    private PatUserInfoServiceImpl patUserInfoService;

    @GetMapping
    public String getAllPatUsersInfo(Model model){
        System.out.println("ЗАХОДИТ");
        return "patUserinfo";
    }
}
