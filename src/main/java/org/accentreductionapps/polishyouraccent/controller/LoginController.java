package org.accentreductionapps.polishyouraccent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.CredentialNotFoundException;

@RestController
public class LoginController {
    //GET - display login page
    //POST - send login credentials
    //POST - create an account(optional)

    @GetMapping("/login")
    public void displayLoginPage() {
        //RETURN PAGE
    }

    @PostMapping("/login/auth")
    public String sendLoginCredentials(String emailAddressOrUsername, String password) throws CredentialNotFoundException, AccountNotFoundException {
//        throw new CredentialNotFoundException("Empty credentials ");
//        throw new AccountNotFoundException("That account doesn't exist");
        //After sign in user receive login token.
//        return OAuth2ResourceServerProperties.Jwt;
        return "authorisation token number"; //TODO
    }
//TODO ADD boolean check if user is active
}