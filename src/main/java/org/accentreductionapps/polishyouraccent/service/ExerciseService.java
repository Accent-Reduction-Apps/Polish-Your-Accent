package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(User author,
                                   String exerciseTitle,
                                   String exerciseText,
                                   LocalDateTime dateTimeWhenExerciseWasCreated,
                                   int testResult,
                                   String videoFileName,
                                   List<Exercise.Question> listOfQuestions) {
        Exercise newExercise = new Exercise(author, exerciseTitle, exerciseText, dateTimeWhenExerciseWasCreated, testResult, videoFileName, listOfQuestions);
        exerciseRepository.addModel(newExercise);
        return newExercise;
    }

    public Exercise getExerciseById(Long id) {
        return exerciseRepository.getModelById(id);
    }

    public void updateExercise(Long id, Exercise exerciseToUpdate) {
        exerciseRepository.updateModel(id, exerciseToUpdate);
    }
}
