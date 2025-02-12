package dev.fizlrock.waterwalk.domain.port.output;

import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.exception.LocationNameNotFoundException;
import dev.fizlrock.waterwalk.domain.exception.RouteNameNotFoundException;
import dev.fizlrock.waterwalk.domain.port.input.LocationRepository;
import dev.fizlrock.waterwalk.domain.port.input.RouteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** RouteService */
@Service
public class RouteService {

  @Autowired RouteRepository routeRepository;
  @Autowired LocationRepository placeRepository;

  public void createRoute(String placeName, Route route) {

    var place =
        placeRepository
            .findByName(placeName)
            .orElseThrow(() -> new LocationNameNotFoundException(placeName));

    place.addRoute(route);

    placeRepository.save(place);
  }

  public List<Route> getRoutesInPlace(String placeName) {
    // TODO
    return null;
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
