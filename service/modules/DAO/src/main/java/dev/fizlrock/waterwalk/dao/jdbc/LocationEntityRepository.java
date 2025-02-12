package dev.fizlrock.waterwalk.dao.jdbc;

import dev.fizlrock.waterwalk.dao.entity.LocationEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

/** PlaceJdbcRepository */
@Repository
public interface LocationEntityRepository extends ListCrudRepository<LocationEntity, Long> {

  public Optional<LocationEntity> findByName(String name);

  public void deleteByName(String name);

  List<LocationEntity> findAll();

  // TODO findAll с пагинацией
}
