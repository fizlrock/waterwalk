package dev.fizlrock.waterwalk.dao.jdbc;

import dev.fizlrock.waterwalk.dao.entity.PlaceEntity;
import java.util.Optional;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

/** PlaceJdbcRepository */
@Repository
public interface PlaceEntityRepository extends ListCrudRepository<PlaceEntity, Long> {

  public Optional<PlaceEntity> findByName(String name);

  public void deleteByName(String name);
}
