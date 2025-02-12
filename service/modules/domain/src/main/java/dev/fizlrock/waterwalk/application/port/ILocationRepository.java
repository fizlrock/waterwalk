package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.domain.entity.Location;
import java.util.List;
import java.util.Optional;

/** PlaceRepository */
public interface ILocationRepository {

  public boolean containsLocationWithName(String name);

  public void insert(Location p);

  public Optional<Location> findByName(String name);

  public void removeByName(String name);

  public void updateByName(String place_name, Location p);

  public List<Location> findAll(int skip, int limit);

  public void save(Location place);
}
