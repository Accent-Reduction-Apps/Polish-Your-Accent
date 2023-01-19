package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class LessonEditController {

    @Autowired
    private LessonService lessonService;


    public LessonEditController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping(value = "/lesson/create_lesson")
    public void getLessonForm() {
        lessonService.getLessonForm();
    }


    @GetMapping(value = "/lesson/{lessonIdString}/edit_lesson")
    public Lesson getLessonToEdit(@PathVariable(value = "lessonIdString") String lessonIdString) {
        return lessonService.getLessonById(Long.valueOf(lessonIdString));
    }

    @PostMapping(value = "/lesson/create_lesson")
    public Lesson saveCreatedLesson(
            User author,
            String lessonName,
            String lessonCategory,
            LocalDateTime dateTimeWhenLessonWasCreated,
            List<Exercise> exercisesList) {
        return lessonService.createLesson(author, lessonName, lessonCategory, dateTimeWhenLessonWasCreated, exercisesList);
    }

    @PutMapping(value = "/lesson/{lessonIdString}/edit_lesson")
    public void saveEditedLesson(Lesson lessonEditedToSave) {
        lessonService.updateLesson(lessonEditedToSave.getId(), lessonEditedToSave);
    }
}
