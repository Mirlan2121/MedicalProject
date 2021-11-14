package com.example.Medical.Project.controller;

import com.example.Medical.Project.entity.User;
import com.example.Medical.Project.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/users")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/userall")
    public String getAllUsers(Model model){
        Iterable<User> allUser = userService.getAllUsers();
        model.addAttribute("users", allUser);
        model.addAttribute("log", "Не известный пользователь");
        return "users";
    }

    @GetMapping("/newuser")
    public String menuUsers(Model model){
        return "newuser";
    }
    @GetMapping("/loguser")
    public String logUsers(Model model){
        return "loguser";
    }

    @PostMapping("/loguser")
    public String logUser(@RequestParam String login, @RequestParam String password, Model model){
        User user = User.builder().login(login).password(password).build();
        userService.getByUserName(user.getLogin());
        model.addAttribute("log", user.getLogin());
        // Тут надо сделать проверку есть ль такой в БД если да то переидти на страницу списка юсеров
        return "redirect:/userall";
    }

    @PostMapping("/newuser")
    public String newUser(@RequestParam String login, @RequestParam String password, Model model){
        User user = User.builder().login(login).password(password).build();
//        if (user.getLogin() != null){
//            userService.getByUserName()
//        }
        model.addAttribute("log", user.getLogin());
        return "redirect:/userall";
    }
}
