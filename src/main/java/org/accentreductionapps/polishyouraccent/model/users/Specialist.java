package org.accentreductionapps.polishyouraccent.model.users;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercises;
import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

public class Specialist extends User {

    private List<Exercises> listOfExercisesCreated;
    private List<Lesson> listOfLessonsCreated;

    public Specialist(String emailAddress, String password) {
        super(emailAddress, password);
    }
}
