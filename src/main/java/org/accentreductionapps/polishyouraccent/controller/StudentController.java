package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.users.Student;
import org.accentreductionapps.polishyouraccent.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/account_details/{studentId}")
    public Student getStudentAccountDetails(@PathVariable("studentId") Long studentId) {
        return studentService.getStudents(studentId);
    }
}
