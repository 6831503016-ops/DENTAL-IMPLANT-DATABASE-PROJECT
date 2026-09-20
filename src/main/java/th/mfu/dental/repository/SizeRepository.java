package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.Size;

public interface SizeRepository
        extends CrudRepository<Size, Long> {
}