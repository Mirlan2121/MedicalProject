package com.itacademi.medicalcard.controller;

import com.itacademi.medicalcard.entity.Users;
import com.itacademi.medicalcard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/alluser")
    public String getAllUsers(Model model){
        Iterable<Users> usersList = userRepository.findAll();
        model.addAttribute("userList", usersList);
        return "alluser";
    }

    @PostMapping("/register")
    public String register(@RequestParam String login, @RequestParam String password, Model model){
        System.out.println("Дебаг Зашол");
        Users user = Users.builder().login(login).password(password).build();
        userRepository.save(user);
        model.addAttribute("text", login + " Зарегестрирван успешно");
        return "redirect:/alluser";
    }

}
