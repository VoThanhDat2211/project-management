package com.project_management.demo.controller;

import com.project_management.demo.dto.ResponseDTO;
import com.project_management.demo.dto.UserDTO;
import com.project_management.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/get-by-email")
    public ResponseDTO<UserDTO> getUserByEmail(@RequestParam String email) {
        System.out.println(1);
        UserDTO userDTO = userService.getUserByEmail(email);

        return ResponseDTO.<UserDTO>builder().code(HttpStatus.OK.value()).message("success").data(userDTO).build();
    }

//    private <T> ResponseDTO<T> getResponseDTO(int code, String message, T data) {
//        ResponseDTO<T> responseDTO = new ResponseDTO<>();
//        responseDTO.setCode(code);
//        responseDTO.setMessage(message);
//        if (data != null) {
//            responseDTO.setData(data);
//        }
//        return responseDTO;
//    }

}
