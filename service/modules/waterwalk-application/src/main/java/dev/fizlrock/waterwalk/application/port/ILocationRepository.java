package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.domain.entity.Location;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.ListCrudRepository;

/** PlaceRepository */
public interface ILocationRepository extends ListCrudRepository<Location, UUID> {

  Optional<Location> findByName(String name);
}
