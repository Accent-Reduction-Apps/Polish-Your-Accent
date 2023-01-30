INSERT INTO lessons VALUES (1001, 'false','text of lesson 1 bla bla bla', 'lesson 1');
INSERT INTO lessons VALUES (1002, 'false','text of lesson 2 bla bla bla', 'lesson 2');
INSERT INTO lessons VALUES (1003, 'false','text of lesson 3 bla bla bla', 'lesson 3');

-- insert into lessons (user_id) values (1004);       //todo how to create SQL-dump with null boolean
insert into lessons (lesson_id,  completed) values (1005, 'false');
insert into lessons (lesson_id,  topic,  completed) values (1006, 'lesson 6',  'false');
insert into lessons (lesson_id,  topic, text, completed) values (1007, 'lesson 7', 'text of lesson 7 bla bla bla', 'false');

INSERT INTO users VALUES (104, 'Dawid Deszcz', 'emailDawid@gmail.com', 'hasloDawid');
INSERT INTO users VALUES (105, 'Sebastian Sosin', 'emailSebastian@gmail.com', 'hasloSebastian');
INSERT INTO users VALUES (106, 'Mateusz Gasior', 'emailMateusz@gmail.com', 'hasloMateusz');
INSERT INTO users VALUES (107, 'Marcin Szuwalski', 'emailMarcin@gmail.com', 'hasloMarcin');

insert into users (user_Id, email_address, name, password) VALUES (109, 'Jan Kowalski', 'emailJan@gmail.com', 'hasloJan');

insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (104, 1001);
insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (104, 1002);
insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (104, 1003);
insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (104, 1007);

insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (107, 1001);
insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (107, 1002);
insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (107, 1003);
insert into users_user_lessons (user_student_user_id, user_lessons_lesson_id) values (107, 1007);