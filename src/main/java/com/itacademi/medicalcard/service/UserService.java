package com.itacademi.medicalcard.service;

import com.itacademi.medicalcard.entity.Users;
import java.util.List;

public interface UserService {
    List<Users> usersList();
    Users saveUsers(Users users);
    Users getById(Long id);
    Users deleteId(Long id);
}
