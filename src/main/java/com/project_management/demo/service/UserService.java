package com.project_management.demo.service;

import com.project_management.demo.dto.UserDTO;

public interface UserService {
    UserDTO getUserByEmail(String email);
}
