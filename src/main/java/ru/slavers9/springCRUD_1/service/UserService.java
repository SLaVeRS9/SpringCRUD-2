package ru.slavers9.springCRUD_1.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.slavers9.springCRUD_1.models.UserModel;
import ru.slavers9.springCRUD_1.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;
    public List<UserModel> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserModel getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    public UserModel editUser(Long id) {
        return userRepository.editUser(id);
    }
}
