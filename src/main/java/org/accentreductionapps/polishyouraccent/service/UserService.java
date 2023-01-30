package org.accentreductionapps.polishyouraccent.service;



import org.accentreductionapps.polishyouraccent.model.UserStudent;
import org.accentreductionapps.polishyouraccent.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void addUser(UserStudent userStudent) {
    userRepository.saveAndFlush(userStudent);
    }

    public List<UserStudent> getAllUsers() {
        return userRepository.findAll();
    }

    public UserStudent getUserById(Long id) {
        Optional<UserStudent> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public void updateUser(UserStudent userStudentOld, UserStudent userStudentNew) {
        userStudentOld.setName(userStudentNew.getName());
        userStudentOld.setEmailAddress(userStudentNew.getEmailAddress());
        userStudentOld.setPassword(userStudentNew.getPassword());
    }
}
