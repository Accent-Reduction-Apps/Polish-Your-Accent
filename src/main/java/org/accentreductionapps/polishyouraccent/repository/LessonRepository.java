package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.Lesson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonRepository implements RepositoryInterface<Lesson> {

    Map<Long,Lesson> lessons = new HashMap<>();

    @Override
    public Lesson addModel(Lesson model) {
        return null;
    }

    @Override
    public Lesson deleteModel(Long id) {
        return null;
    }

    @Override
    public List<Lesson> getAllModels() {
        return null;
    }

    @Override
    public Lesson getModelById(Long id) {
        return null;
    }

    @Override
    public Lesson updateModel(Long id, Lesson model) {
        return null;
    }
}
