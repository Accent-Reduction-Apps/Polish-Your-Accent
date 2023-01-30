package org.accentreductionapps.polishyouraccent.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

    @ManyToMany(cascade = CascadeType.ALL) //todo what is it?
    @JoinTable
    private Set<Lesson> userLessons = new HashSet<>();
}
