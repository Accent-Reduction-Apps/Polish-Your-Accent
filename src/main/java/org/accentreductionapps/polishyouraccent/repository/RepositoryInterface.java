package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.Lesson;

import java.util.List;

public interface RepositoryInterface<T> {

    T addModel(T model);

    T deleteModel(Long id);

    List<Lesson> getAllModels();

    T getModelById(Long id);

    T updateModel(Long id, T model);

}
