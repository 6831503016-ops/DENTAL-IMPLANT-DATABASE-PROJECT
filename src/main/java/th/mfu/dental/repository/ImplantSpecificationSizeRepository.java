package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.ImplantSpecificationSize;

public interface ImplantSpecificationSizeRepository
        extends CrudRepository<ImplantSpecificationSize, Long> {
}