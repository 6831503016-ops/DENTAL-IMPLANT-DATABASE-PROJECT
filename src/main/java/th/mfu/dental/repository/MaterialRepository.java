package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.Material;

public interface MaterialRepository
        extends CrudRepository<Material, Long> {
}