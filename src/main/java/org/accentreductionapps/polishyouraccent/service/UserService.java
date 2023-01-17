package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.users.Student;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createStudent(String emailAddress, String password) {
        return new Student(emailAddress, password);
    }


}
