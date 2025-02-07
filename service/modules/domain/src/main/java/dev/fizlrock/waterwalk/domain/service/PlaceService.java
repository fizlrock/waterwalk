package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.domain.exception.DomainException;
import dev.fizlrock.waterwalk.domain.exception.LocationNameDublicateException;
import dev.fizlrock.waterwalk.domain.exception.LocationNameNotFoundException;
import dev.fizlrock.waterwalk.domain.repository.PlaceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

  @Autowired PlaceRepository placeRep;

  public void deleteByName(String name) {
    if (!placeRep.containsPlaceWithName(name)) throw new LocationNameNotFoundException(name);

    if (placeRep.hasRoutesWithName(name))
      throw new DomainException("Место имеет маршруты. Необходимо сначала удалить их.");

    placeRep.removeByName(name);
  }

  public List<Place> getAllPlaces(int skip, int limit) {
    return placeRep.findAll(skip, limit);
  }

  public Place findByName(String name) {
    var place = placeRep.findByName(name);
    return place.orElseThrow(() -> new LocationNameNotFoundException(name));
  }

  public void saveNew(Place p) {
    if (placeRep.containsPlaceWithName(p.getName()))
      throw new LocationNameDublicateException(p.getName());
    placeRep.insert(p);
  }

  public void updateExisting(String place_name, Place p) {
    String new_place_name = p.getName();

    if (!placeRep.containsPlaceWithName(place_name))
      throw new LocationNameNotFoundException(place_name);

    if (placeRep.containsPlaceWithName(new_place_name))
      throw new LocationNameDublicateException(new_place_name);
    placeRep.updateByName(place_name, p);
  }
}
