package ru.slavers9.springCRUD_2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.slavers9.springCRUD_2.models.UserModel;
import ru.slavers9.springCRUD_2.repository.UserRepository;

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

    public void editUser(UserModel user, Long id) {
        userRepository.editUser(user, id);
    }

    public void addUser(UserModel user) {
        userRepository.addUser(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}
