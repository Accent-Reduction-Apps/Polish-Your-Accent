package org.accentreductionapps.polishyouraccent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class RegisterController {
    //GET - display page with form to add new user
    //POST - try to create user

    @GetMapping("/register")
    public ResponseEntity<String> registerSite() {
        //TODO RETURN PAGE
        return ResponseEntity.created(URI.create("http://localhost:8080/register")).header("Register Page", "Some value?").body("Hello Register Page");
    }

    @PostMapping("/register")
    public boolean sendRequestNewAccountCreate(String emailAddress,String username, String password){

        return false;
    }

}
