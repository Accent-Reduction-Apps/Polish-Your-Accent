package org.accentreductionapps.polishyouraccent.repository;


import org.accentreductionapps.polishyouraccent.model.users.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class UserRepository extends dbMockupMap<User> implements Repository<User> {

    private final Map<Long, User> user = new HashMap<>();

    @Override
    public void addModel(User model) {
        user.put(findId(user), model);

    }

    @Override
    public void deleteModel(Long id) {
        user.remove(id);

    }

    @Override
    public List<User> getAllModels() {
        return (List<User>) user.values();
    }

    @Override
    public User getModelById(Long id) {
        return user.get(id);
    }

    @Override
    public void updateModel(Long id, User model) {
        user.put(id, model);

    }
}
