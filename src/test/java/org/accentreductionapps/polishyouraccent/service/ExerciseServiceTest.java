package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.accentreductionapps.polishyouraccent.repository.ExerciseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.mockito.Mockito.*;

class ExerciseServiceTest {

    private ExerciseService exerciseService;
    private ExerciseRepository exerciseRepository;

    @BeforeEach
    void setUp() {
        exerciseRepository = mock(ExerciseRepository.class);
        exerciseService = new ExerciseService(exerciseRepository);
    }

    @Test
    public void GivenCreateExerciseRequest_WhenExerciseServiceCreateExerciseCalled_ThenExerciseRepositoryAddModelIsCalled() {
        Exercise testExercise = exerciseService.createExercise(null, null, null, null, null, null, null);
        verify(exerciseRepository, times(1)).addModel(testExercise);
    }

    @Test
    public void GivenGetExerciseByIdRequest_WhenExerciseServiceGetExerciseByIdCalled_ThenExerciseRepositoryGetModelByIdIsCalled() {
        long generatedLong = new Random().nextLong();
        exerciseService.getExerciseById(generatedLong);
        verify(exerciseRepository, times(1)).getModelById(generatedLong);
    }

    @Test
    public void GivenUpdateExerciseRequest_WhenExerciseServiceUpdateExerciseCalled_ThenExerciseRepositoryUpdateModelIsCalled() {
        Exercise testExercise = mock(Exercise.class);
        exerciseService.updateExercise(0L, testExercise);
        verify(exerciseRepository, times(1)).updateModel(0L, testExercise);
    }
}