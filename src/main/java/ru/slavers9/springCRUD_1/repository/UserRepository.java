package ru.slavers9.springCRUD_1.repository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.slavers9.springCRUD_1.models.UserModel;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepository {
    JdbcTemplate jdbcTemplate;

    public List<UserModel> getAllUsers() {
        String query = "SELECT * FROM Users";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(UserModel.class));
    }

    public UserModel getUserById(Long id) {
        String query = "SELECT * FROM Users WHERE id=?";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(UserModel.class), id)
                .stream().findAny().orElseThrow();
    }

    public UserModel editUser(Long id) {
        return getUserById(id);
    }


}
