package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.ImplantImage;

public interface ImplantImageRepository
        extends CrudRepository<ImplantImage, Long> {
}