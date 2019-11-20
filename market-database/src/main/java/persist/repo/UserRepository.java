package persist.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import persist.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    boolean existsByUsername(String username);

    Optional<User> getUserByUsername(String username);
}
