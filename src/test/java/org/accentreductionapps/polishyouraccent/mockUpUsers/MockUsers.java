package org.accentreductionapps.polishyouraccent.mockUpUsers;

import org.accentreductionapps.polishyouraccent.model.LessonsHistory;
import org.accentreductionapps.polishyouraccent.model.users.Specialist;
import org.accentreductionapps.polishyouraccent.model.users.Student;

import java.util.ArrayList;
import java.util.List;

public class MockUsers {


    public static Student getUserStudent(Long userId) {
        return new Student(
                "dawid@gmail.com",
                "dfd",
                userId,
                3,
                "male",
                "2 years",
                2,
                "yes",
                prepareMockLessonHistoryList()
        );
    }


    public static Student getInvalidUserStudent() {
        return new Student(
                "dawid@gmail.com",
                "",
                1L,
                3,
                "",
                "2 years",
                2,
                "yes",
                prepareMockLessonHistoryList()
        );
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
