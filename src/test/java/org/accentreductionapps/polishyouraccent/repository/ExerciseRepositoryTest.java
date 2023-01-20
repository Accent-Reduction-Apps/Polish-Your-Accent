package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ExerciseRepositoryTest {

    private ExerciseRepository exerciseRepository;

    @BeforeEach
    void setUp() {
        exerciseRepository = new ExerciseRepository();
    }

    @Test
    void addSingleExercise() {
        Exercise mockExercise = mock(Exercise.class);
        exerciseRepository.addModel(mockExercise);
        assertEquals(mockExercise, exerciseRepository.getModelById(0L));
    }

    @Test
    void getExerciseById() {
        Exercise mockExerciseToBeAdded = mock(Exercise.class);
        exerciseRepository.addModel(mockExerciseToBeAdded);
        assertEquals(mockExerciseToBeAdded, exerciseRepository.getModelById(0L));
    }

    @Test
    void updateExercise() {
        Exercise mockExerciseUpdateWith = mock(Exercise.class);
        exerciseRepository.updateModel(0L, mockExerciseUpdateWith);
        assertEquals(mockExerciseUpdateWith, exerciseRepository.getModelById(0L));
    }
}
