package org.accentreductionapps.polishyouraccent.repository;

import java.util.List;

public interface Repository<T> {

    Long addModel(T model);

    void deleteModel(Long id);

    List<T> getAllModels();

    T getModelById(Long id);

    void updateModel(Long id, T model);

}
