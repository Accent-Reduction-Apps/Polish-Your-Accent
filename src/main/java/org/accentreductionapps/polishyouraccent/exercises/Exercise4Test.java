package org.accentreductionapps.polishyouraccent.exercises;

import org.accentreductionapps.polishyouraccent.model.Word;

import java.util.List;

public class Exercise4Test implements Exercises {
    private List<Question> listOfQuestions;
    private Integer testResult;


    private class Question {
        private Word correctAnswer;
        private List<Word> wordsToChooseFrom;
    }
}
