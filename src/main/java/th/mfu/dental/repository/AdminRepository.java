package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.Admin;

public interface AdminRepository
        extends CrudRepository<Admin, Long> {
}