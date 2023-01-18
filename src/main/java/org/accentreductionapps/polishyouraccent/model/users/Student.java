package org.accentreductionapps.polishyouraccent.model.users;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;

import java.util.List;


public class Student extends User {

    private int age;
    private String gender;
    private String howLongHaveYouBeenLearningEnglish;
    private int daysWithoutBreak;
    private String musicInstrumentPlayed;


    private List<Lesson> listOfLessonsDone;
    private List<Exercise> listOfTestsDone;
    private Long id;


    public Student(String emailAddress, String password) {
        super(emailAddress, password);
    }


}
