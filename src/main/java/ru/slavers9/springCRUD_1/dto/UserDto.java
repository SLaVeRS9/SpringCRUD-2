package ru.slavers9.springCRUD_1.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class UserDto implements Serializable {
    private String name;
    private Integer age;
    private String email;
}
