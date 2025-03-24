package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.exception.LocationNameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** LocationService */
@Service
public class LocationService {
  @Autowired ILocationRepository repository;

  public Location getLocation(String locationName) {
    return repository
        .findByName(locationName)
        .orElseThrow(() -> new LocationNameNotFoundException(locationName));
  }
}
