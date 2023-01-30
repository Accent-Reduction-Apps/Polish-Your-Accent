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

    private String topic;

    private boolean completed;  //todo decide enumerate or boolean

    private String text;

//@Enumerated(enumtype.string);
//    private Status status;




}