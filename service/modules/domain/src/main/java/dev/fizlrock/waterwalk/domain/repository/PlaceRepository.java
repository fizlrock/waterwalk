package dev.fizlrock.waterwalk.domain.repository;

import dev.fizlrock.waterwalk.domain.entity.Place;
import java.util.List;
import java.util.Optional;

/** PlaceRepository */
public interface PlaceRepository {

  public boolean containsPlaceWithName(String name);

  public void insert(Place p);

  public Optional<Place> findByName(String name);

  public void removeByName(String name);

  /**
   * Имеет ли место с указанным именем маршруты
   *
   * @param name
   * @return
   */
  public boolean hasRoutesWithName(String name);

  public void updateByName(String place_name, Place p);

  public List<Place> findAll(int skip, int limit);
}
