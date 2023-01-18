package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonsService {

    private final LessonRepository repository;

    @Autowired
    public LessonsService(LessonRepository repository) {
        this.repository = repository;
    }

    public List<Lesson> getAllLessons() {
        return repository.getAllModels();
    }

}
