package org.accentreductionapps.polishyouraccent.repository;

import org.accentreductionapps.polishyouraccent.model.User_Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User_Student, Long> {
}
