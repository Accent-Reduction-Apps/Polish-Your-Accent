package org.accentreductionapps.polishyouraccent.model.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {

    private final String emailAddress;
    private final String password;
    Long id;

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }


}
