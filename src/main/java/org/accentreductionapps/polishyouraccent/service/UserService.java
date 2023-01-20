package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.users.Specialist;
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

    public User createNewStudent(String emailAddress, String password, int age) {
        User newStudent = new Student(emailAddress, password, age, null, null, 0, "default", null);
        userRepository.addModel(newStudent);
        return newStudent;
    }

    public User createNewSpecialist(String emailAddress, String password, Integer verificationCode) {
        User newSpecialist = new Specialist(emailAddress, password, verificationCode);
        userRepository.addModel(newSpecialist);
        return newSpecialist;
    }

    public User getUser(Long id) {
        return userRepository.getModelById(id);
    }

    public boolean checkIfEmailAddressIsNotUsed(String emailAddress) { //TODO TEST
        String emailList = userRepository.getAllModels().listIterator().next().getEmailAddress();
        return emailList.equals(emailAddress);
    }
}
