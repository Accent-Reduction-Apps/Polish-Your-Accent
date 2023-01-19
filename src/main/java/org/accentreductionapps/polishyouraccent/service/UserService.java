package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id){return userRepository.getModelById(id);}
}
