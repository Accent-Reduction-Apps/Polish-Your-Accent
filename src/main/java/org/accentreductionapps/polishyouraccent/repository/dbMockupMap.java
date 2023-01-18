package org.accentreductionapps.polishyouraccent.repository;

import java.util.Map;

public abstract class dbMockupMap<T> {

    public Long findId(Map<Long, T> map) {
        Long id = (long) map.size();
        while (map.containsKey(id)) {
            id++;
        }
        return id;
    }
}
