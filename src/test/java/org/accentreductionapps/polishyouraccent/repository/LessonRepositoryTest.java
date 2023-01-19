package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class LessonRepositoryTest {

    private final List<Object> lessonsInitList =
            Arrays.asList(new Lesson[]{mock(Lesson.class), mock(Lesson.class), mock(Lesson.class)});
    private LessonRepository lessonRepository;

    @BeforeEach
    void setUp() {
        lessonRepository = new LessonRepository();
    }

    void populateRepository() {
        for (Object initLesson : lessonsInitList
        ) {
            lessonRepository.addModel((Lesson) initLesson);
        }
    }

    @Test
    void addMultipleLessons_and_getAllModels() {
        populateRepository();
        List<Lesson> lessonsList = lessonRepository.getAllModels();
        assertEquals(lessonsInitList, lessonsList);
    }

    @Test
    void addSingleLesson() {
        Lesson mockLesson = mock(Lesson.class);
        lessonRepository.addModel(mockLesson);
        assertEquals(mockLesson, lessonRepository.getModelById(0L));
    }

}