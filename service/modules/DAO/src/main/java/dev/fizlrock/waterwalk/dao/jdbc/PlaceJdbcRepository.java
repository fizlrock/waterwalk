package dev.fizlrock.waterwalk.dao.jdbc;

import dev.fizlrock.waterwalk.dao.entity.PlaceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/** PlaceJdbcRepository */
@Repository
public interface PlaceJdbcRepository extends CrudRepository<PlaceEntity, Long> {}
