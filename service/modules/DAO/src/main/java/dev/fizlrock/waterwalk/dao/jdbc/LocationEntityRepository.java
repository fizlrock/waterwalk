package dev.fizlrock.waterwalk.dao.jdbc;

import dev.fizlrock.waterwalk.dao.entity.LocationEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/** PlaceJdbcRepository */
@Repository
public interface LocationEntityRepository extends ListCrudRepository<LocationEntity, Long> {

  public Optional<LocationEntity> findByName(String name);

  @Modifying
  @Query("DELETE FROM place WHERE name = :name")
  public void removeByName(@Param("name") String name);

  public List<LocationEntity> findAll();

  // TODO findAll с пагинацией
}
