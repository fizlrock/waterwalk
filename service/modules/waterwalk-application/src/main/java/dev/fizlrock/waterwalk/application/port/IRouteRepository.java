package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.entity.RouteId;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.repository.ListCrudRepository;

public interface IRouteRepository extends ListCrudRepository<Route, RouteId> {

  Set<Route> findByLocationId(UUID uuid);
}
