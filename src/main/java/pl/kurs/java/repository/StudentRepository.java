package pl.kurs.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kurs.java.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
