package org.accentreductionapps.polishyouraccent.model;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter

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

    @ManyToMany(cascade = CascadeType.ALL) //todo Dawid check this annotation
    @JoinTable
    private Set<Lesson> userLessons = new HashSet<>();
}
