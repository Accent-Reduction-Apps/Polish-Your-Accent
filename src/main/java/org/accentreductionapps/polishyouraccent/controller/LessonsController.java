package org.accentreductionapps.polishyouraccent.controller;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.accentreductionapps.polishyouraccent.service.LessonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonsController {

    final
    LessonsService lessonsService;

    @Autowired
    public LessonsController(LessonsService lessonsService) {
        this.lessonsService = lessonsService;
    }

    @GetMapping("/lessons")
    public List<Lesson> getAllLessons() {
        return lessonsService.getAllLessons();
    }

}
