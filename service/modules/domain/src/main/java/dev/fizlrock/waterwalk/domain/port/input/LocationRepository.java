package dev.fizlrock.waterwalk.domain.repository;

import dev.fizlrock.waterwalk.domain.entity.Location;
import java.util.List;
import java.util.Optional;

/** PlaceRepository */
public interface LocationRepository {

  public boolean containsLocationWithName(String name);

  public void insert(Location p);

  public Optional<Location> findByName(String name);

  public void removeByName(String name);

  /**
   * Имеет ли место с указанным именем маршруты
   *
   * @param name
   * @return
   */
  public boolean hasRoutesWithName(String name);

  public void updateByName(String place_name, Location p);

  public List<Location> findAll(int skip, int limit);

  public void save(Location place);
}
