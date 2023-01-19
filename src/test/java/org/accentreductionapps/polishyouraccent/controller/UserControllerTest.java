package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.mockUpUsers.MockUsers;
import org.accentreductionapps.polishyouraccent.model.users.Student;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserControllerTest {

    private UserController userController;
    private UserService userService;
    private final Long USER_ID = 1L;
    private final Long INVALID_USER_ID = 9999L;

    @BeforeEach
    void setUp() {
        userService = mock(UserService.class);
        userController = new UserController(userService);
    }

    /*
    Testing scenarios:
    Getters testing:
    1) Student not found
    2) Student found
    3) Specialist not found
    4) Specialist found

    Posting testing;
    5) Create User successfully
    6) Missing data in User
    7) Exception thrown successfully
    8) Code return 404

     */

    @Test
    void studentAccountDetailsFound() {
        Student mockStudent = MockUsers.getUserStudent(USER_ID);
        when(userService.getUser(USER_ID)).thenReturn(mockStudent);

        User userStudent = userController.getStudentAccountDetails(USER_ID);

        assertTrue(userStudent instanceof Student);
        assertEquals(USER_ID, userStudent.getId());
    }


    @Test
    void studentAccountDetailsNotFound() {
        Student mockStudent = null;
        when(userService.getUser(USER_ID)).thenReturn(null);

        User userStudent = userController.getStudentAccountDetails(USER_ID);

        assertFalse(userStudent instanceof Student);
        assertNull(userStudent);
    }








    @Test
    void getStudentAccountDetailsNotFound() {
        Student mockStudent = MockUsers.getUserStudent(INVALID_USER_ID);
        when(userService.getUser(USER_ID)).thenReturn(mockStudent);

        User userStudent = userController.getStudentAccountDetails(USER_ID);

        assertTrue(userStudent instanceof Student);
        assertNotEquals(USER_ID,userStudent.getId());
    }


}