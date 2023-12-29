package ru.slavers9.springCRUD_1.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.slavers9.springCRUD_1.models.UserModel;
import ru.slavers9.springCRUD_1.service.UserService;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {
    private UserService userService;

    @GetMapping()
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "users/user";
    }

    //TODO
    @PatchMapping("/{id}")
    public String editUser(@ModelAttribute("user") UserModel user, @PathVariable("id") Long id) {
        userService.editUser(user, id);
        return "redirect:users/{id}";
    }

    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "users/edit";
    }
}
