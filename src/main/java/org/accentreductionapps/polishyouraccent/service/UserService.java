package org.accentreductionapps.polishyouraccent.service;



import org.accentreductionapps.polishyouraccent.model.User_Student;
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


    public void addUser(User_Student userStudent) {
    userRepository.saveAndFlush(userStudent);
    }

    public List<User_Student> getAllUsers() {
        return userRepository.findAll();
    }

    public User_Student getUserById(Long id) {
        Optional<User_Student> user = userRepository.findById(id);
        return user.orElse(null);
    }

}
