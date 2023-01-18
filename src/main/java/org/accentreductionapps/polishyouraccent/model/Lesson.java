package org.accentreductionapps.polishyouraccent.model;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercises;
import org.accentreductionapps.polishyouraccent.model.users.User;

import java.time.LocalDateTime;
import java.util.List;

public class Lesson {
    private Long id;
    private User author;
    private String lessonName;
    private String lessonCategory;
    private LocalDateTime dateTimeWhenLessonWasCreated;
    private List<Exercises> exercisesList;

    public Lesson(User author,
                  String lessonName,
                  String lessonCategory,
                  LocalDateTime dateTimeWhenLessonWasCreated,
                  List<Exercises> exercisesList) {
        this.author = author;
        this.lessonName = lessonName;
        this.lessonCategory = lessonCategory;
        this.dateTimeWhenLessonWasCreated = dateTimeWhenLessonWasCreated;
        this.exercisesList = exercisesList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonCategory() {
        return lessonCategory;
    }

    public void setLessonCategory(String lessonCategory) {
        this.lessonCategory = lessonCategory;
    }

    public LocalDateTime getDateTimeWhenLessonWasCreated() {
        return dateTimeWhenLessonWasCreated;
    }

    public void setDateTimeWhenLessonWasCreated(LocalDateTime dateTimeWhenLessonWasCreated) {
        this.dateTimeWhenLessonWasCreated = dateTimeWhenLessonWasCreated;
    }

    public List<Exercises> getExercisesList() {
        return exercisesList;
    }

    public void setExercisesList(List<Exercises> exercisesList) {
        this.exercisesList = exercisesList;
    }

}
