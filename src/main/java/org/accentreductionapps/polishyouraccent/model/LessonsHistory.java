package org.accentreductionapps.polishyouraccent.model;

import java.time.LocalDateTime;
import java.util.List;

public class LessonsHistory {
    long lessonHistory_id;
    LocalDateTime wasStarted;
    LocalDateTime wasCompleted;
    int results;
    Lesson lesson_id;
}
