package ru.moskalevms.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.moskalevms.persist.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
