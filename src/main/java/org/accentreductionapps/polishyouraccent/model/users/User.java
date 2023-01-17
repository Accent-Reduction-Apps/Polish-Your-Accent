package org.accentreductionapps.polishyouraccent.model.users;

public abstract class User {

    private final String emailAddress;
    private final String password;

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }
}
