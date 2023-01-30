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


public class Lesson {

    @Id
    @GeneratedValue
    private Long userId;
    private String topic;
    private String text;
    private boolean completed;
}