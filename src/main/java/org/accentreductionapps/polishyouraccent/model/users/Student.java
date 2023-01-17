package org.accentreductionapps.polishyouraccent.model.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.accentreductionapps.polishyouraccent.model.exercises.Exercises;
import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;


public class Student extends User {

    private int age;
    private String gender;
    private String howLongHaveYouBeenLearningEnglish;
    private int daysWithoutBreak;
    private String musicInstrumentPlayed;


    private List<Lesson> listOfLessonsDone;
    private List<Exercises> listOfTestsDone;
    private Long id;


    public Student(String emailAddress, String password) {
        super(emailAddress, password);
    }



}
