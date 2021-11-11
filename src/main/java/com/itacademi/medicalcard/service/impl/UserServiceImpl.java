package com.itacademi.medicalcard.service.impl;

import com.itacademi.medicalcard.entity.Users;
import com.itacademi.medicalcard.repository.UserRepository;
import com.itacademi.medicalcard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> usersList() {
        return userRepository.findAll();
    }

    @Override
    public Users saveUsers(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public Users deleteId(Long id) {
        Users user = getById(id);
        userRepository.delete(user);
        return user;
    }
}
