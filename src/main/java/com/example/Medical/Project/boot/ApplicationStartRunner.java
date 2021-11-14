package com.example.Medical.Project.boot;

import com.example.Medical.Project.entity.User;
import com.example.Medical.Project.repository.UserRoleRepository;
import com.example.Medical.Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartRunner implements CommandLineRunner {
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
//        User admin = new User();
//        admin.setLogin("admin");
//        admin.setPassword("1234");
//        admin.setUserInfo("Администратор");
//        admin.setIsActive(1L);
//        userService.seve(admin);
    }
}
