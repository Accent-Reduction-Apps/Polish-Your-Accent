package org.accentreductionapps.polishyouraccent.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class User_Student {

    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String emailAddress;
    private String password;
}
