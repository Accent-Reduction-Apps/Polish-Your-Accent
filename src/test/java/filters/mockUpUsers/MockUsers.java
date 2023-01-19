package filters.mockUpUsers;

import org.accentreductionapps.polishyouraccent.model.LessonsHistory;
import org.accentreductionapps.polishyouraccent.model.users.Specialist;
import org.accentreductionapps.polishyouraccent.model.users.Student;

import java.util.ArrayList;
import java.util.List;

public class MockUsers {


    public static Student getUserStudent(Long userId) {


        Student student =new Student(
                "dawid@gmail.com",
                "dfd",
                3,
                "male",
                "2 years",
                2,
                "yes",
                prepareMockLessonHistoryList()
        );

        student.setId(userId);
        return student;
    }


    public static Student getInvalidUserStudent() {


        Student student =new Student(
                "dawid@gmail.com",
                "dfd",
                3,
                "male",
                "2 years",
                2,
                "yes",
                prepareMockLessonHistoryList()
        );

        student.setId(999999L);
        return student;
    }

    public static List<LessonsHistory> prepareMockLessonHistoryList() {
        return new ArrayList<>();
    }

    public static Specialist getUserSpecialist() {
        return new Specialist(
                "dawid@gmail.com",
                "dfd",
                123456
        );
    }
}
