package pl.kurs.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kurs.java.model.Retirement;

public interface RetirementRepository extends JpaRepository<Retirement, Long> {
}
