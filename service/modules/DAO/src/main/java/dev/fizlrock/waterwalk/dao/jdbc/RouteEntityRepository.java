package dev.fizlrock.waterwalk.dao.jdbc;

import dev.fizlrock.waterwalk.dao.entity.RouteEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

/** RouteEntityRepository */
@Repository
public interface RouteEntityRepository extends ListCrudRepository<RouteEntity, Long> {}
