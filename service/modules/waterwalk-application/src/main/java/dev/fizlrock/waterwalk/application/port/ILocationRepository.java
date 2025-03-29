package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.entity.LocationId;
import java.util.Optional;
import org.springframework.data.repository.ListCrudRepository;

/** PlaceRepository */
public interface ILocationRepository extends ListCrudRepository<Location, LocationId> {

  Optional<Location> findByName(String name);
}
