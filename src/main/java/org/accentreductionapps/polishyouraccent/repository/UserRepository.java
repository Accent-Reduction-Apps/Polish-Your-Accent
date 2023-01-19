package org.accentreductionapps.polishyouraccent.repository;


import org.accentreductionapps.polishyouraccent.model.users.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class UserRepository extends dbMockupMap<User> implements Repository<User> {

    private final Map<Long, User> users = new HashMap<>();

    @Override
    public Long addModel(User model) {
        Long id = findId(users);
        users.put(id, model);
        return id;
    }

    @Override
    public void deleteModel(Long id) {
        users.remove(id);

    }

    @Override
    public List<User> getAllModels() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public User getModelById(Long id) {
        return users.get(id);
    }

    @Override
    public void updateModel(Long id, User model) {
        users.put(id, model);

    }
}
