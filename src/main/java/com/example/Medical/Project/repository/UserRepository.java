package com.example.Medical.Project.repository;


import com.example.Medical.Project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> { // Санек
}
