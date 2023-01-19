package org.accentreductionapps.polishyouraccent.model.users;

import lombok.Getter;
import lombok.Setter;
import org.accentreductionapps.polishyouraccent.model.LessonsHistory;

import java.util.List;


@Getter
@Setter
public class Student extends User {


    private int age;
    private String gender;
    private String howLongHaveYouBeenLearningEnglish;
    private int daysWithoutBreak;
    private String musicInstrumentPlayed;


    private List<LessonsHistory> listOfLessonsDone;


    public Student(String emailAddress, String password, int age, String gender, String howLongHaveYouBeenLearningEnglish, int daysWithoutBreak, String musicInstrumentPlayed, List<LessonsHistory> listOfLessonsDone) {
        super(emailAddress, password);
        this.age = age;
        this.gender = gender;
        this.howLongHaveYouBeenLearningEnglish = howLongHaveYouBeenLearningEnglish;
        this.daysWithoutBreak = daysWithoutBreak;
        this.musicInstrumentPlayed = musicInstrumentPlayed;
        this.listOfLessonsDone = listOfLessonsDone;
    }


}
