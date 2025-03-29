package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.application.port.IRouteRepository;
import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.entity.LocationId;
import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.exception.EntityWithIdNotFoundException.LocationWithIdNotFoundException;
import dev.fizlrock.waterwalk.domain.exception.LocationHasRoutesException;
import dev.fizlrock.waterwalk.domain.exception.LocationNameDublicateException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LocationService {

  @Autowired ILocationRepository locRepository;
  @Autowired IRouteRepository routeRepository;

  public List<Location> getLocationList() {
    return locRepository.findAll();
  }

  public Location createLocation(String name, String description) {

    Optional<Location> nameConflict = locRepository.findByName(name);
    if (nameConflict.isPresent()) throw new LocationNameDublicateException(name);

    var location = new Location(name, description);
    locRepository.save(location);

    return location;
  }

  public Location deleteLocation(LocationId id) {
    var location = getLocationById(id);

    Set<Route> routes = routeRepository.findByLocationId(id.uuid());
    if (routes.size() > 0) throw new LocationHasRoutesException(location.getName());

    locRepository.delete(location);
    return location;
  }

  public Location getLocationById(LocationId id) {
    log.debug("Поиск локации с id: {}", id);

    return locRepository.findById(id).orElseThrow(() -> new LocationWithIdNotFoundException());
  }

  public Location updateLocation(LocationId id, String name, String description) {

    var location = getLocationById(id);

    if (!location.getName().equals(name)) {

      if (locRepository.findByName(name).isPresent())
        throw new LocationNameDublicateException(name);
      location.setName(name);
    }
    location.setComment(description);

    locRepository.save(location);
    return location;
  }
}
