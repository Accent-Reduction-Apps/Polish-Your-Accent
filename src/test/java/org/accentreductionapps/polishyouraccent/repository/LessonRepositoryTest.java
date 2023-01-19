package org.accentreductionapps.polishyouraccent.repository;

import filters.LessonRepositoryMockup;
import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class LessonRepositoryTest {


    private LessonRepository lessonRepository;
    private final List<Object> lessonsMockupList = LessonRepositoryMockup.lessonsMockupList;

    @BeforeEach
    void setUp() {
        lessonRepository = new LessonRepository();
    }

    void populateRepository() {
        for (Object initLesson : lessonsMockupList
        ) {
            lessonRepository.addModel((Lesson) initLesson);
        }
    }

    @Test
    void addMultipleLessons_and_getAllModels() {
        populateRepository();
        List<Lesson> lessonsList = lessonRepository.getAllModels();
        assertEquals(lessonsMockupList, lessonsList);
    }

    @Test
    void addSingleLesson() {
        Lesson mockLesson = mock(Lesson.class);
        lessonRepository.addModel(mockLesson);
        assertEquals(mockLesson, lessonRepository.getModelById(0L));
    }

    @Test
    void getLessonById() {
        Lesson mockLessonToBeAdded = mock(Lesson.class);
        lessonRepository.addModel(mockLessonToBeAdded);
        assertEquals(mockLessonToBeAdded, lessonRepository.getModelById(0L));
    }

    @Test
    void updateLesson() {
        Lesson mockLessonToBeUpdated = mock(Lesson.class);
        Lesson mockLessonUpdateWith = mock(Lesson.class);
        lessonRepository.updateModel(0L, mockLessonUpdateWith);
        assertEquals(mockLessonUpdateWith, lessonRepository.getModelById(0L));

    }

}