package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.repository.LessonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class LessonsServiceTest {


    private LessonsService lessonsService;
    private LessonRepository lessonRepository;


    @BeforeEach
    void setUp() {
        lessonRepository = mock(LessonRepository.class);
        lessonsService = new LessonsService(lessonRepository);

    }


    @Test
    public void GivenGetAllLessonsRequest_WhenLessonControllerGetAllLessonCalled_ThenLessonServiceGetAllLessonIsCalled() {
        lessonsService.getAllLessons();
        verify(lessonRepository, times(1)).getAllModels();
    }

}