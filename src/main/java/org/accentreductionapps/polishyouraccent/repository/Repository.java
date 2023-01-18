package org.accentreductionapps.polishyouraccent.repository;

import java.util.List;

public class Repository <T>implements RepositoryInterface<T>{

    DbMockup dataBase = new DbMockup();

    @Override
    public void addModel(T model) {
    }

    @Override
    public T deleteModel(Long id) {
        return null;
    }

    @Override
    public List<T> getAllModels() {
        return null;
    }

    @Override
    public T getModelById(Long id) {
        return null;
    }

    @Override
    public T updateModel(Long id, T model) {
        return null;
    }
}
