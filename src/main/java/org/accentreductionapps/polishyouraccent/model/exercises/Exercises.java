package org.accentreductionapps.polishyouraccent.model.exercises;

import org.accentreductionapps.polishyouraccent.model.users.User;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Exercises {
    User author;
    String exerciseTitle;
    String exerciseText;
    LocalDateTime dateTimeWhenExerciseWasCreated = null;
    int testResult = 0;
    String videoFileName;


    List<Exercise4Test.Question> listOfQuestions = null;


}
