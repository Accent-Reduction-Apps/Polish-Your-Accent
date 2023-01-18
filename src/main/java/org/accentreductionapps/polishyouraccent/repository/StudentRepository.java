package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.users.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class StudentRepository extends dbMockupMap<Student> implements Repository<Student> {

    private final Map<Long, Student> students = new HashMap<>();

    @Override
    public void addModel(Student model) {
        students.put(findId(students), model);

    }

    @Override
    public void deleteModel(Long id) {
        students.remove(id);

    }

    @Override
    public List<Student> getAllModels() {
        return (List<Student>) students.values();
    }

    @Override
    public Student getModelById(Long id) {
        return students.get(id);
    }

    @Override
    public void updateModel(Long id, Student model) {
        students.put(id, model);

    }
}
