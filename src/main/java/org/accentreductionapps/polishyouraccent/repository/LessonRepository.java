package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.Lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class LessonRepository extends dbMockupMap<Lesson> implements Repository<Lesson> {

    private final Map<Long, Lesson> lessons = new HashMap<>();

    @Override
    public void addModel(Lesson model) {
        Long id = findId(lessons);
        lessons.put(id, model);

    }

    @Override
    public void deleteModel(Long id) {
        lessons.remove(id);
    }

    @Override
    public List<Lesson> getAllModels() {
        return new ArrayList<Lesson>(lessons.values());
    }

    @Override
    public Lesson getModelById(Long id) {
        return lessons.get(id);
    }

    @Override
    public void updateModel(Long id, Lesson model) {
        lessons.put(id, model);
    }


}
