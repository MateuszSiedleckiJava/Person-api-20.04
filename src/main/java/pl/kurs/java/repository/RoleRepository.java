package pl.kurs.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kurs.java.auth.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
