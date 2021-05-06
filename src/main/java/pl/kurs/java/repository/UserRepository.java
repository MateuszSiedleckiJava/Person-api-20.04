package pl.kurs.java.repository;

import pl.kurs.java.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select distinct u from User u left join fetch u.roles where u.login = ?1")
    Optional<User> findByLogin(String login);
}
