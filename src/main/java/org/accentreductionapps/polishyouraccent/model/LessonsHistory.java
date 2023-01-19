package org.accentreductionapps.polishyouraccent.model;

import java.time.LocalDateTime;

public class LessonsHistory {
    long id;
    LocalDateTime wasStarted;
    LocalDateTime wasCompleted;
    int results;
    Lesson lesson_id;
}
