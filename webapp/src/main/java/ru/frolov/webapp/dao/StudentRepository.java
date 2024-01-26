package ru.frolov.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.frolov.webapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
