package com.example.auth.authexample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class RegisterUserDto {
    private String email;
    private String password;
    private String fullName;

}
