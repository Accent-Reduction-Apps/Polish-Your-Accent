package org.accentreductionapps.polishyouraccent.model.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Specialist extends User {

    private Integer verificationCode;

    public Specialist(String emailAddress, String password, Integer verificationCode) {
        super(emailAddress, password);
        this.verificationCode = verificationCode;
    }

}
