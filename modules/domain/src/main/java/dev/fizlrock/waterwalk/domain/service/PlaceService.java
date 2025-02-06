package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.domain.repository.PlaceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

  @Autowired PlaceRepository placeRep;

  private static final RuntimeException nameNotFoundException =
      new IllegalStateException("Локации с таким именем нет");
  private static final RuntimeException nameDublicateException =
      new IllegalStateException("Уже существует локация с таким названием");

  public void deleteByName(String name) {
    if (!placeRep.containsPlaceWithName(name)) throw nameNotFoundException;

    if (placeRep.hasRoutesWithName(name))
      throw new IllegalStateException("Место имеет маршруты. Необходимо сначала удалить их.");

    placeRep.removeByName(name);
  }

  public List<Place> getAllPlaces(int skip, int limit) {
    return placeRep.findAll(skip, limit);
  }

  public Place findByName(String name) {
    var place = placeRep.findByName(name);
    return place.orElseThrow(() -> nameNotFoundException);
  }

  public void saveNew(Place p) {
    if (placeRep.containsPlaceWithName(p.getName())) throw nameDublicateException;
    placeRep.insert(p);
  }

  public void updateExisting(String place_name, Place p) {
    if (!placeRep.containsPlaceWithName(place_name)) throw nameNotFoundException;
    if (placeRep.containsPlaceWithName(p.getName())) throw nameDublicateException;
    placeRep.updateByName(place_name, p);
  }
}
