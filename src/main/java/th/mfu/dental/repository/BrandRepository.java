package th.mfu.dental.repository;

import org.springframework.data.repository.CrudRepository;
import th.mfu.dental.model.Brand;

public interface BrandRepository extends CrudRepository<Brand, Long> {
}