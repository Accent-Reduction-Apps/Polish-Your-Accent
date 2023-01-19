package filters;

import org.accentreductionapps.polishyouraccent.model.Lesson;
import org.assertj.core.util.Arrays;

import java.util.List;

import static org.mockito.Mockito.mock;

public class LessonRepositoryMockup {

    public final static List<Object> lessonsMockupList =
            Arrays.asList(new Lesson[]{mock(Lesson.class), mock(Lesson.class), mock(Lesson.class)});

}
