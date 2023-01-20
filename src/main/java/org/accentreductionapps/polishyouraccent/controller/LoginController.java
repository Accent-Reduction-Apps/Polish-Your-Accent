package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }
    //GET - display login page
    //POST - send login credentials
    //POST - create an account(optional)

    @GetMapping(value = "/login")
    public ResponseEntity<String> displayLoginPage() {
        return ResponseEntity.ok("Welcome to LoginPage!");
    }

    @PostMapping("/login")
    public ResponseEntity<String> sendLoginCredentials(String emailAddress, String password) {
        if (userService.checkEmailExistInDatabase(emailAddress)) {
            return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User doesn't exist!", HttpStatus.NOT_FOUND);
        }

    }
}