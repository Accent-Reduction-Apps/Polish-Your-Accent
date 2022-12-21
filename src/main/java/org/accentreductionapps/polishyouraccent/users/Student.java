package org.accentreductionapps.polishyouraccent.users;

import org.accentreductionapps.polishyouraccent.exercises.Exercises;
import org.accentreductionapps.polishyouraccent.model.Lesson;

import java.util.List;

public class Student extends User {
    private int age;
    private String gender;
    private String howLongHaveYouBeenLearningEnglish;
    private int dayWithoutBreak;


    private List<Exercises> listOfTestsDone;
    private List<Lesson> listOfLessonsDone;

    public Student(String emailAddress, String password) {
        super(emailAddress, password);
    }


}
