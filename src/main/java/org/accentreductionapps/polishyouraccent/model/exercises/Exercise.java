package org.accentreductionapps.polishyouraccent.model.exercises;

import org.accentreductionapps.polishyouraccent.model.Word;
import org.accentreductionapps.polishyouraccent.model.users.User;

import java.time.LocalDateTime;
import java.util.List;

public class Exercise {
    private Long id;
    User author;
    String exerciseTitle;
    String exerciseText;

    LocalDateTime dateTimeWhenExerciseWasCreated = null;

    Integer testResult = 0;
    String videoFileName;
    List<Question> listOfQuestions = null;

    public Exercise(User author,
                    String exerciseTitle,
                    String exerciseText,
                    LocalDateTime dateTimeWhenExerciseWasCreated,
                    Integer testResult,
                    String videoFileName,
                    List<Question> listOfQuestions) {
        this.author = author;
        this.exerciseTitle = exerciseTitle;
        this.exerciseText = exerciseText;
        this.dateTimeWhenExerciseWasCreated = dateTimeWhenExerciseWasCreated;
        this.testResult = testResult;
        this.videoFileName = videoFileName;
        this.listOfQuestions = listOfQuestions;
    }

    public static class Question {
        private Word correctAnswer;
        private List<Word> wordsToChooseFrom;
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

    public String getExerciseTitle() {
        return exerciseTitle;
    }

    public void setExerciseTitle(String exerciseTitle) {
        this.exerciseTitle = exerciseTitle;
    }

    public String getExerciseText() {
        return exerciseText;
    }

    public void setExerciseText(String exerciseText) {
        this.exerciseText = exerciseText;
    }

    public LocalDateTime getDateTimeWhenExerciseWasCreated() {
        return dateTimeWhenExerciseWasCreated;
    }

    public void setDateTimeWhenExerciseWasCreated(LocalDateTime dateTimeWhenExerciseWasCreated) {
        this.dateTimeWhenExerciseWasCreated = dateTimeWhenExerciseWasCreated;
    }

    public Integer getTestResult() {
        return testResult;
    }

    public void setTestResult(Integer testResult) {
        this.testResult = testResult;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    public List<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(List<Question> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }
}
