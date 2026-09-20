package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.User;

public interface UserRepository
        extends CrudRepository<User, Long> {
}