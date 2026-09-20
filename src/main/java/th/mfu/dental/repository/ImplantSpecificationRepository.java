package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.ImplantSpecification;

public interface ImplantSpecificationRepository
        extends CrudRepository<ImplantSpecification, Long> {
}