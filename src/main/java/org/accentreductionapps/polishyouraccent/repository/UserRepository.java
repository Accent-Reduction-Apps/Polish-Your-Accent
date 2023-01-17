package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.users.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    Map<Long, User> userRepository = new HashMap<>();

    public Map<Long, User> getAllUsers() {
        return userRepository;
    }

    public User getUser(long id) {
        return userRepository.get(id);
    }

    public void addUser(long id, User user) {
        userRepository.put(id, user);
    }

    public void deleteUser(long id) {
        userRepository.remove(id);
    }

    public void updateUser(long id, User user) {
        userRepository.put(id, user);
    }
}
