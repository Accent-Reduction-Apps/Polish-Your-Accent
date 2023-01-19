package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.accentreductionapps.polishyouraccent.service.ExerciseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.mockito.Mockito.*;

class ExerciseEditControllerTest {

    @Mock
    private ExerciseService exerciseService;
    private ExerciseEditController exerciseEditController;

    @BeforeEach
    void setUp() {
        exerciseService = mock(ExerciseService.class);
        exerciseEditController = new ExerciseEditController(exerciseService);
    }

    @Test
    public void GivenGetExerciseFormRequest_WhenExerciseEditControllerGetExerciseFormCalled_ThenExerciseServiceGetExerciseFormIsCalled() {
        exerciseEditController.getExerciseForm();
        verify(exerciseService, times(1)).getExerciseForm();
    }

    @Test
    public void GivenGetExerciseToEditRequest_WhenExerciseEditControllerGetExerciseToEditCalled_ThenExerciseServiceGetExerciseByIdIsCalled() {
        long generatedLong = new Random().nextLong();
        long mockedLessonId = 0L;
        exerciseEditController.getExerciseToEdit(String.valueOf(mockedLessonId), String.valueOf(generatedLong));
        verify(exerciseService, times(1)).getExerciseById(generatedLong);
    }

    @Test
    public void GivenSaveCreatedExerciseRequest_WhenExerciseEditControllerGetSaveCreatedExercise_ThenExerciseServiceCreateExerciseIsCalled() {
        exerciseEditController.saveCreatedExercise(null, null, null, null, null, null, null);
        verify(exerciseService, times(1)).createExercise(null, null, null, null, null, null, null);
    }

    @Test
    public void GivenSaveEditedExerciseRequest_WhenExerciseEditControllerGetSaveEditedExercise_ThenExerciseServiceUpdateExerciseIsCalled() {
        Exercise testExercise = mock(Exercise.class);
        exerciseEditController.saveEditedExercise(testExercise);
        verify(exerciseService, times(1)).updateExercise(0L, testExercise);
    }
}

