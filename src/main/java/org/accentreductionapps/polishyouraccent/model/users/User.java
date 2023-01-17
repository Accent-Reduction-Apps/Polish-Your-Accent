package org.accentreductionapps.polishyouraccent.model.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public abstract class User {

    private final String emailAddress;
    private final String password;
    private Long id;

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }


}
