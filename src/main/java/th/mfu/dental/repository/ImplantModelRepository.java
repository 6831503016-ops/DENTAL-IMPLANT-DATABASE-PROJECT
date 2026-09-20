package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.ImplantModel;

import java.util.List;

public interface ImplantModelRepository
        extends CrudRepository<ImplantModel, Long> {

    List<ImplantModel> findByModelNameContainingIgnoreCase(String modelName);
}