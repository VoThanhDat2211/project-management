package com.project_management.demo.dto;


import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class UserDTO {
    private int id;

    private String username;
}
