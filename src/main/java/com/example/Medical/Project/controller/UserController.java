package com.example.Medical.Project.controller;

import com.example.Medical.Project.entity.User;
import com.example.Medical.Project.repository.UserRepository;
import com.example.Medical.Project.service.UserService;
import com.example.Medical.Project.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/userall")
    public String getAllUsers(Model model){
        Iterable<User> allUser = userService.getAllUsers();
        System.out.println("ДЕБАГ" + allUser);
        model.addAttribute("users", allUser);
        return "users";
    }
    @PostMapping("/newuser")
    public String newUser(@RequestParam String login, @RequestParam String password, Model model){
        User user = User.builder().login(login).password(password).build();
        userService.seve(user);
        return "redirect:/users";
    }
}