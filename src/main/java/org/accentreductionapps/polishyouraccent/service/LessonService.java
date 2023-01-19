package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;
import org.accentreductionapps.polishyouraccent.model.users.User;
import org.accentreductionapps.polishyouraccent.repository.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LessonService {

    private Repository lessonRepository;

    public LessonService(Repository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public Lesson createLesson(User author,
                               String lessonName,
                               String lessonCategory,
                               LocalDateTime dateTimeWhenLessonWasCreated,
                               List<Exercise> exercisesList) {
        Lesson newLesson = new Lesson(author, lessonName, lessonCategory, dateTimeWhenLessonWasCreated, exercisesList);
        lessonRepository.addModel(newLesson);
        return newLesson;
    }

    public Lesson getLessonById(Long id) {
        return (Lesson) lessonRepository.getModelById(id);
    }

    public void updateLesson(Long id, Lesson lessonToUpdate) {
        lessonRepository.updateModel(id, lessonToUpdate);
    }
}
