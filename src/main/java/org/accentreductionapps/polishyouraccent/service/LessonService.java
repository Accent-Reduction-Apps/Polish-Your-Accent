package org.accentreductionapps.polishyouraccent.service;



import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;


    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public void addLesson(Lesson lesson) {
    lessonRepository.saveAndFlush(lesson);
    }

    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }

    public Lesson getLessonById(Long id) {
        Optional<Lesson> lesson = lessonRepository.findById(id);
        return lesson.orElse(null);
    }

    public void updateLesson(Lesson lessonOld, Lesson lessonNew) {
        lessonOld.setTopic(lessonNew.getTopic());
        lessonOld.setText(lessonNew.getText());
        lessonOld.setCompleted(lessonNew.isCompleted());
    }
}
