package com.example.ManagerProjectPDS.Dtos;

import com.example.ManagerProjectPDS.Enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private Role role;
}
