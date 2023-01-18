package org.accentreductionapps.polishyouraccent.service;

import org.accentreductionapps.polishyouraccent.model.users.Student;
import org.accentreductionapps.polishyouraccent.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudents(Long id){return studentRepository.getModelById(id);}
}
