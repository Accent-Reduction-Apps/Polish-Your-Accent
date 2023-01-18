package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
public class ExerciseEditController {

    @Autowired
    private ExerciseService exerciseService;


    public ExerciseEditController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping(value = "/lesson/{lessonIdString}/edit_lesson/create_exercise")
    public void createExercise() {
        // template for creating a new exercise
    }

    @GetMapping(value = "/lesson/{lessonIdString}/edit_lesson/{exercise_id}/edit_exercise")
    public Exercise getLessonToEdit(@PathVariable(value = "lessonIdString") String lessonIdString,
                                    @PathVariable(value = "exercise_id") String exerciseIdString) {
        return exerciseService.getExerciseById(Long.valueOf(exerciseIdString));
    }

    @PostMapping(value = "/lesson/{lessonIdString}/edit_lesson/create_exercise")
    public Exercise saveCreatedExercise(
            User author,
            String exerciseTitle,
            String exerciseText,
            LocalDateTime dateTimeWhenExerciseWasCreated,
            int testResult,
            String videoFileName,
            List<Exercise.Question> listOfQuestions) {
        return exerciseService.createExercise(author, exerciseTitle, exerciseText, dateTimeWhenExerciseWasCreated, testResult, videoFileName, listOfQuestions);
    }

    @PutMapping(value = "/lesson/{lessonIdString}/edit_lesson/{exercise_id}/edit_exercise")
    public Exercise saveEditedExercise(Exercise exerciseEditedToSave) {
        return exerciseService.updateExercise(exerciseEditedToSave.getId(), exerciseEditedToSave);
    }
}
