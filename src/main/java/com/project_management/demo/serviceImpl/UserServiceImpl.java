package com.project_management.demo.serviceImpl;

import com.project_management.demo.dto.UserDTO;
import com.project_management.demo.entity.User;
import com.project_management.demo.repository.UserRepository;
import com.project_management.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return this.convertToUserDTO(user);
    }

    private UserDTO convertToUserDTO(User user) {
        return new ModelMapper().map(user, UserDTO.class);
    }

    private User convertToUser(UserDTO userDTO) {
        return new ModelMapper().map(userDTO, User.class);
    }
}
