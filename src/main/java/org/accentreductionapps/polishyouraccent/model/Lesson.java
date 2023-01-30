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
@Table(name = "lessons")


public class Lesson {

    @Id
    @GeneratedValue
    private Long userId;
    private String topic;
    private String text;
    private boolean completed;

}