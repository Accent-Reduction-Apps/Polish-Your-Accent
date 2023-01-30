import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static filters.LessonRepositoryMockup.lessonsMockupList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLessonsGetAllModels {


    private LessonRepository lessonRepository;
    private LessonsController lessonsController;


    @BeforeEach
    void setUp() {
        lessonRepository = new LessonRepository();
        populateRepository();
        LessonsService lessonsService = new LessonsService(lessonRepository);
        lessonsController = new LessonsController(lessonsService);
    }

    void populateRepository() {
        for (Object initLesson : lessonsMockupList
        ) {
            lessonRepository.addModel((Lesson) initLesson);
        }
    }


    @Test
    public void testGetAllLessons() {
        List<Lesson> lessonsReceived = lessonsController.getAllLessons();
        assertEquals(lessonsReceived, lessonsMockupList);
    }

}
