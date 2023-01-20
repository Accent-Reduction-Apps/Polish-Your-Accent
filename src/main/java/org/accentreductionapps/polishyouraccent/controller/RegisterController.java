package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }
    //GET - display page with form to add new user
    //POST - try to create user

    @GetMapping("/register")
    public ResponseEntity<String> registerSite() {
        //TODO RETURN PAGE
        return ResponseEntity.ok("Welcome to Register Page!");
    }

    @PostMapping("/register/student")
    public ResponseEntity<User> sendRequestNewStudentAccountCreate(String emailAddress, String password, Integer age) {
        User newStudent = userService.createNewStudent(emailAddress, password, age);
        return ResponseEntity.ok(newStudent);
    }

    @PostMapping("/register/specialist")
    public ResponseEntity<User> sendRequestNewSpecialistAccountCreate(String emailAddress, String password, Integer verificationCode) {
        User newSpecialist = userService.createNewSpecialist(emailAddress, password, verificationCode);
        return ResponseEntity.ok(newSpecialist);
    }

    @GetMapping(value = "/register/all") //TODO FOR TESTS
    public List<User> showAllRegisteredUsers() {
        return userService.showAllUsers();
    }
}

