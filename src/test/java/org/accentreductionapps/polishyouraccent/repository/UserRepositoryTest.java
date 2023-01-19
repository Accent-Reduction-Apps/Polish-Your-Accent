package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.controller.UserController;
import org.accentreductionapps.polishyouraccent.mockUpUsers.MockUsers;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class UserRepositoryTest {

    private UserRepository userRepository;
    private final Long USER_ID = 1L;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();


    }

    @Test
    void addModel() {
        User user = MockUsers.getUserStudent(USER_ID);

        int sizeBeforeModelAdded = userRepository.getAllModels().size();
        assertEquals(0, sizeBeforeModelAdded);

        Long idReturned = userRepository.addModel(user);

        int sizeAfterModelAdded = userRepository.getAllModels().size();
        assertEquals(1, sizeAfterModelAdded);

    }
}