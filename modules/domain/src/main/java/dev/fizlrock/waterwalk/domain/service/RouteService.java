package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.exception.LocationNameNotFoundException;
import dev.fizlrock.waterwalk.domain.exception.RouteNameDublicateException;
import dev.fizlrock.waterwalk.domain.exception.RouteNameNotFoundException;
import dev.fizlrock.waterwalk.domain.repository.PlaceRepository;
import dev.fizlrock.waterwalk.domain.repository.RouteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** RouteService */
@Service
public class RouteService {

  @Autowired RouteRepository routeRepository;
  @Autowired PlaceRepository placeRepository;

  public List<Route> getRoutesInPlace(String placeName) {
    if (!placeRepository.containsPlaceWithName(placeName))
      throw new LocationNameNotFoundException(placeName);

    return routeRepository.getRoutesWherePlace(placeName);
  }

  public void saveNewRoute(String placeName, Route route) {
    // if place has route with same name
    var existingRoutes = getRoutesInPlace(placeName);
    existingRoutes.stream()
        .map(r -> r.getName())
        .filter(name -> name.equals(route.getName()))
        .findAny()
        .ifPresent(
            name -> {
              throw new RouteNameDublicateException(name);
            });

    routeRepository.addRouteToPlace(placeName, route);
  }

  public void deleteRoute(String placeName, String routeName) {
    var existingRoutes = getRoutesInPlace(placeName);

    existingRoutes.stream()
        .map(Route::getName)
        .filter(routeName::equals)
        .findAny()
        .orElseThrow(() -> new RouteNameNotFoundException(routeName, placeName));

    // TODO Проверить, есть ли запланированные прогулки

    routeRepository.deleteRoute(placeName, routeName);
  }

  public void updateExistingRoute(String placeName, String oldRouteName, Route route) {
    var existingRoutes = getRoutesInPlace(placeName);

    existingRoutes.stream()
        .map(Route::getName)
        .filter(oldRouteName::equals)
        .findAny()
        .orElseThrow(() -> new RouteNameNotFoundException(oldRouteName, placeName));

    routeRepository.updateRoute(placeName, oldRouteName, route);
  }
}
