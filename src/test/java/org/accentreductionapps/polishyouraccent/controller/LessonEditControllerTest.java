package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.service.LessonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.mockito.Mockito.*;

class LessonEditControllerTest {

    @Mock
    private LessonService lessonService;
    private LessonEditController lessonEditController;

    @BeforeEach
    void setUp() {
        lessonService = mock(LessonService.class);
        lessonEditController = new LessonEditController(lessonService);
    }


    @Test
    public void GivenGetLessonFormRequest_WhenLessonEditControllerGetLessonFormCalled_ThenLessonServiceGetLessonFormIsCalled() {
        lessonEditController.getLessonForm();
        verify(lessonService, times(1)).getLessonForm();
    }

    @Test
    public void GivenGetLessonToEditRequest_WhenLessonEditControllerGetLessonToEditCalled_ThenLessonServiceGetLessonByIdIsCalled() {
        long generatedLong = new Random().nextLong();
        lessonEditController.getLessonToEdit(String.valueOf(generatedLong));
        verify(lessonService, times(1)).getLessonById(generatedLong);
    }

    @Test
    public void GivenSaveCreatedLessonRequest_WhenLessonEditControllerGetSaveCreatedLesson_ThenLessonServiceCreateLessonIsCalled() {
        lessonEditController.saveCreatedLesson(null, null, null, null, null);
        verify(lessonService, times(1)).createLesson(null, null, null, null, null);
    }

    @Test
    public void GivenSaveEditedLessonRequest_WhenLessonEditControllerGetSaveEditedLesson_ThenLessonServiceUpdateLessonIsCalled() {
        Lesson testLesson = mock(Lesson.class);
        lessonEditController.saveEditedLesson(testLesson);
        verify(lessonService, times(1)).updateLesson(0L, testLesson);
    }
}
