package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.ImplantType;

public interface ImplantTypeRepository
        extends CrudRepository<ImplantType, Long> {
}