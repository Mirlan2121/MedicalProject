package com.itacademi.medicalcard.repository;

import com.itacademi.medicalcard.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
