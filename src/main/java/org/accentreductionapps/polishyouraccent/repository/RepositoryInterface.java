package org.accentreductionapps.polishyouraccent.repository;

import java.util.List;

public interface RepositoryInterface<T> {

    void addModel(T model);

    T deleteModel(Long id);

    List<T> getAllModels();

    T getModelById(Long id);

    T updateModel(Long id, T model);

}
