package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.model.exercises.Exercise;

import java.util.List;

public interface Repository<T> {

    void addModel(T model);

    void deleteModel(Long id);

    List<T> getAllModels();

    T getModelById(Long id);

    void updateModel(Long id, T model);

}
