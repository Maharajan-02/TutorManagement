package com.tutormanager.dto;

import lombok.Data;

@Data
public class TutorRegisterDTO {
    private String name;
    private String email;
    private String phone;
    private String password;
}
