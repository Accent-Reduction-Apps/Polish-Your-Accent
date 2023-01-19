package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;
    //GET - display login page
    //POST - send login credentials
    //POST - create an account(optional)

    @GetMapping("/login")
    @ResponseBody
    public ResponseEntity<String> displayLoginPage() {
        //TODO RETURN PAGE
        return ResponseEntity.created(URI.create("http://localhost:8080.login")).header("Login Page", "Some value?").body("Hello Login Page");
    }

    @PostMapping("/login")
    public ResponseEntity<String> sendLoginCredentials(String emailAddressOrUsername, String password) {
//        throw new CredentialNotFoundException("Empty credentials ");
//        throw new AccountNotFoundException("That account doesn't exist");
        //After sign in user receive login token.
//        return OAuth2ResourceServerProperties.Jwt;

        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }
//TODO ADD boolean check if user is active
}