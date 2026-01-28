package iuh.fit.se.service;

import iuh.fit.se.dto.RegisterRequest;
import iuh.fit.se.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Trong package com.example.authdemo.service
@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public String registerUser(RegisterRequest request) {
        if(userRepository.existsByUsername(request.getUsername())) {
            return "User đã tồn tại!";
        }
        // Logic lưu User...
        return "Đăng ký thành công";
    }
}
