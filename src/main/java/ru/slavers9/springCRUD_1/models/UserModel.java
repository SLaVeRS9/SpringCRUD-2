package ru.slavers9.springCRUD_1.models;

import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
