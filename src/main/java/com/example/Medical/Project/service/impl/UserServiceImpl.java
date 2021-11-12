package com.example.Medical.Project.service.impl;

import com.example.Medical.Project.entity.User;
import com.example.Medical.Project.repository.UserRepository;
import com.example.Medical.Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService { // добавил Санек весь класс
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User seve(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {

        return userRepository.getById(id);
    }

    @Override
    public User deleteUser(Long id) {
        User userDelete = userRepository.getById(id);
        userRepository.delete(userDelete);
        return userDelete;
    }
}
