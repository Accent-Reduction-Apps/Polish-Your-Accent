package org.accentreductionapps.polishyouraccent.model.users;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercises;
import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
public class Student extends User {
    private int age;
    private String gender;
    private String howLongHaveYouBeenLearningEnglish;
    private int daysWithoutBreak;
    private String musicInstrumentPlayed;


    private List<Lesson> listOfLessonsDone;
    private List<Exercises> listOfTestsDone;

    public Student(String emailAddress, String password) {
        super(emailAddress, password);
    }


}
