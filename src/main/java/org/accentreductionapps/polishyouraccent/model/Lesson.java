package org.accentreductionapps.polishyouraccent.model;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercises;

import java.time.LocalDateTime;
import java.util.List;

public class Lesson {
    private String lessonName;
    private String lessonCategory;
    private LocalDateTime dateTimeWhenLessonWasDone;
    private LocalDateTime dateTimeWhenLessonWasCreated;
    private List<Exercises> exercisesList;
}
