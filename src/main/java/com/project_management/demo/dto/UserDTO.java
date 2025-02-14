package com.project_management.demo.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int id;

    @NotNull(message = "Email is required")
    @Max(value = 255, message = "Email cannot exceed 255 characters")
    @Email(message = "Email is invalid")
    private String email;

    @NotNull(message = "Password is required")
    @Max(value = 255, message = "Password cannot exceed 255 characters")
    @Min(value = 6, message = "Password at least 6 characters")
    private String password;

    @NotNull(message = "Role is required")
    @Max(value = 20, message = "Password cannot exceed 20 characters")
    private String role;
}
