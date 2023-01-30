package org.accentreductionapps.polishyouraccent.model;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lessons")


public class Lesson {

    @Id
    @GeneratedValue
    private Long userId;
//    @Column(nullable = true)
    private String topic;

//    @Column(nullable = true)
    private String text;
    private boolean completed;  //todo decide enumerate or boolean

//@Enumerated(enumtype.string);
//    private Status status;




}