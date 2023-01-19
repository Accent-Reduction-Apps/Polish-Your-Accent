package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.repository.LessonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.mockito.Mockito.*;

class LessonServiceTest {

    private LessonService lessonService;
    private LessonRepository lessonRepository;

    @BeforeEach
    void setUp() {
        lessonRepository = mock(LessonRepository.class);
        lessonService = new LessonService(lessonRepository);
    }

    @Test
    public void GivenCreateLessonsRequest_WhenLessonServiceCreateLessonCalled_ThenLessonRepositoryAddModelIsCalled() {
        Lesson testLesson = lessonService.createLesson(null, null, null, null, null);
        testLesson.setId(3L);
        verify(lessonRepository, times(1)).addModel(testLesson);
    }

    @Test
    public void GivenGetLessonByIdRequest_WhenLessonServiceGetLessonByIdCalled_ThenLessonRepositoryGetModelByIdIsCalled() {
        long generatedLong = new Random().nextLong();
        lessonService.getLessonById(generatedLong);
        verify(lessonRepository, times(1)).getModelById(generatedLong);
    }

    @Test
    public void GivenUpdateLessodRequest_WhenLessonServiceUpdateLessonCalled_ThenLessonRepositoryUpdateModelIsCalled() {
        Lesson testLesson = mock(Lesson.class);
        lessonService.updateLesson(0L, testLesson);
        verify(lessonRepository, times(1)).updateModel(0L, testLesson);
    }
}
