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
    private Long lessonId;

    private String topic;

    private boolean completed;

    private String text;






}