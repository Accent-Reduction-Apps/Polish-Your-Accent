package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.users.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    //GET - display page with form to add new user
    //POST - try to create user

    @GetMapping("/register")
public void registerSite(){
        //RETURN PAGE
    }

    @PostMapping("/register")
    public boolean sendRequestNewAccountCreate(String emailAddress,String username, String password){

        return false;
    }

}
