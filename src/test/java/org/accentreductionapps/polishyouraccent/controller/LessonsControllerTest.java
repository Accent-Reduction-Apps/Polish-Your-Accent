package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.service.LessonsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;


class LessonsControllerTest {


    @Mock
    private LessonsService lessonsService;
    private LessonsController lessonsController;


    @BeforeEach
    void setUp() {
        lessonsService = mock(LessonsService.class);
        lessonsController = new LessonsController(lessonsService);
    }


    @Test
    public void GivenGetAllLessonsRequest_WhenLessonControllerGetAllLessonCalled_ThenLessonServiceGetAllLessonIsCalled() {
        lessonsController.getAllLessons();
        verify(lessonsService, times(1)).getAllLessons();
    }
}