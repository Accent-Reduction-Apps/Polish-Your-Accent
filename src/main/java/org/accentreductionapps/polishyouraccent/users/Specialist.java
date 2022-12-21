package org.accentreductionapps.polishyouraccent.users;

import org.accentreductionapps.polishyouraccent.exercises.Exercises;
import org.accentreductionapps.polishyouraccent.model.Lesson;

import java.util.List;

public class Specialist extends User {

    private List<Exercises> listOfExercisesCreated;
    private List<Lesson> listOfLessonsCreated;

    public Specialist(String emailAddress, String password) {
        super(emailAddress, password);
    }
}
