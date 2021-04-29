package pl.kurs.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import pl.kurs.java.model.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long>,
        QuerydslPredicateExecutor<Person> {

    @Query("FROM Person where dtype = ?1")
    List<Person> findByType(String dtype);

}
