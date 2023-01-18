package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.model.users.Student;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final Repository repository;


    public UserService(Repository repository) {
        this.repository = repository;
    }

    public User addAndCreateStudent(String emailAddress, String password) {
        User newStudent = new Student(emailAddress, password);
        repository.addModel(newStudent);
        Lesson lesson = (Lesson) repository.getAllModels(Lesson.class);
        return null;
    }


}
