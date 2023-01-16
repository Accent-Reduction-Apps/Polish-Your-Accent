package org.accentreductionapps.polishyouraccent.model.exercises;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Exercises {
    String exerciseTitle;
    String exerciseText;
    LocalDateTime dateTimeWhenExerciseWasDone = null;
    LocalDateTime dateTimeWhenExerciseWasCreated = null;
    int testResult = 0;
    String videoFileName;



    List<Exercise4Test.Question> listOfQuestions = null;





}
