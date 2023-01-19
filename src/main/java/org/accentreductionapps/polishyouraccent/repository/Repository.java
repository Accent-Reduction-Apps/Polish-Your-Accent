package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.Lesson;

import java.util.List;

public interface Repository<T> {

    void addModel(T model);

    void deleteModel(Long id);

    List<Lesson> getAllModels();

    T getModelById(Long id);

    void updateModel(Long id, T model);

}
