package ru.moskalevms.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.moskalevms.persist.model.User;


import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(String userName);

    boolean existsUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
