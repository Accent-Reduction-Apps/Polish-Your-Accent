package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class ExerciseRepository extends dbMockupMap<Exercise> implements Repository<Exercise> {

    private final Map<Long, Exercise> exercises = new HashMap<>();

    @Override
    public void addModel(Exercise model) {
        exercises.put(findId(exercises), model);
    }

    @Override
    public void deleteModel(Long id) {
        exercises.remove(id);
    }

    @Override
    public List<Exercise> getAllModels() {
        return (List<Exercise>) exercises.values();
    }

    @Override
    public Exercise getModelById(Long id) {
        return exercises.get(id);
    }

    @Override
    public void updateModel(Long id, Exercise model) {
        exercises.put(id, model);
    }


}
