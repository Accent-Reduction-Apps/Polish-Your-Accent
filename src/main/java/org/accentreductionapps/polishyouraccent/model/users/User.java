package org.accentreductionapps.polishyouraccent.model.users;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter

public abstract class User {

    Long id;
    @NonNull
    private final String emailAddress;
    @NonNull
    private final String password;


    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }


}
