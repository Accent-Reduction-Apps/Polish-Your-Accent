package org.accentreductionapps.polishyouraccent.controller;


import org.accentreductionapps.polishyouraccent.model.User_Student;
import org.accentreductionapps.polishyouraccent.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User_Student> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public void addUser(@RequestBody User_Student userStudent) {
        userService.addUser(userStudent);
    }

    @GetMapping("/{id}")
    public User_Student getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }


}
