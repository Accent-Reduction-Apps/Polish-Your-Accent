package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class UserServiceTest {
    private UserService userService;
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @Test
    public void tryToCreateNewStudent_() {
    }

    @Test
    void createNewStudent() {
    }

    @Test
    void createNewSpecialist() {
    }

    @Test
    void getUser() {
    }

    @Test
    void checkEmailExistInDatabase() {
    }

    @Test
    void showAllUsers() {
    }
}