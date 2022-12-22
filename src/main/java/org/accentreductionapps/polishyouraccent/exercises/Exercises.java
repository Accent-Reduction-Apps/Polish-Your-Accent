package org.accentreductionapps.polishyouraccent.exercises;

import org.accentreductionapps.polishyouraccent.model.Word;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Exercises {
    String exerciseTitle;
    String exerciseText;
    LocalDateTime dateTimeWhenExerciseWasDone = null;
    LocalDateTime dateTimeWhenExerciseWasCreated = null;
    int testResult = 0;
    String videoFileName;



    List<Question> listOfQuestions = null;





}
