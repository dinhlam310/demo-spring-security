package com.example.demospringsecurity.repository;

import com.example.demospringsecurity.entity.AppUser;
import com.example.demospringsecurity.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
