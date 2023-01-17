package org.accentreductionapps.polishyouraccent.repository;

public interface RepositoryInterface<T> {

    T addModel(T model);

    T deleteModel(Long id);

    T getAllModels(T param);

    T getModelById(Long id);

    T updateModel(Long id, T model);

}
