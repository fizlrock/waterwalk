package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.dao.repository.LocationRepository;
import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.exception.LocationNameDublicateException;
import dev.fizlrock.waterwalk.domain.exception.LocationHasRoutesException;
import dev.fizlrock.waterwalk.domain.exception.LocationNameNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

  @Autowired
  LocationRepository placeRep;

  public void deleteByName(String name) {
    if (!placeRep.containsLocationWithName(name)) throw new LocationNameNotFoundException(name);

    if (placeRep.hasRoutesWithName(name)) throw new LocationHasRoutesException(name);

    placeRep.removeByName(name);
  }

  public List<Location> getAllPlaces(int skip, int limit) {
    return placeRep.findAll(skip, limit);
  }

  public Location findByName(String name) {
    var place = placeRep.findByName(name);
    return place.orElseThrow(() -> new LocationNameNotFoundException(name));
  }

  public void saveNew(Location p) {
    if (placeRep.containsLocationWithName(p.getLocationName()))
      throw new LocationNameDublicateException(p.getLocationName());
    placeRep.insert(p);
  }

  public void updateExisting(String place_name, Location p) {
    String new_place_name = p.getLocationName();

    if (!placeRep.containsLocationWithName(place_name))
      throw new LocationNameNotFoundException(place_name);

    if (placeRep.containsLocationWithName(new_place_name))
      throw new LocationNameDublicateException(new_place_name);
    placeRep.updateByName(place_name, p);
  }
}
