package org.accentreductionapps.polishyouraccent.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")


public class UserStudent {

    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String emailAddress;
    private String password;
}
