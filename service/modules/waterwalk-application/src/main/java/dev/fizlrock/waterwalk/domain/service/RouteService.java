package dev.fizlrock.waterwalk.domain.service;

import dev.fizlrock.waterwalk.application.port.IRouteRepository;
import dev.fizlrock.waterwalk.domain.entity.LocationId;
import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.entity.RouteId;
import dev.fizlrock.waterwalk.domain.exception.RouteNameDublicateException;
import dev.fizlrock.waterwalk.domain.exception.RouteNotFoundException;
import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import java.time.Duration;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteService {

  @Autowired private LocationService locService;
  @Autowired private IRouteRepository repository;

  private void checkNewRouteName(LocationId locId, String newRouteName) {

    var location = locService.getLocationById(locId);
    var all_routes = repository.findByLocationId(locId.uuid());

    System.out.println(newRouteName);
    System.out.println(all_routes);
    // Проверка на повтор имени локации
    all_routes.stream()
        .map(Route::getName)
        .filter(n -> n.equals(newRouteName))
        .findAny()
        .ifPresent(
            (conflict) -> {
              throw new RouteNameDublicateException(location.getName(), conflict);
            });
  }

  public Collection<Route> findAllRoutesInLocation(LocationId id) {

    return repository.findByLocationId(id.uuid());
  }

  public Route createRoute(
      LocationId locId,
      String name,
      String comment,
      Distance dist,
      Difficulty diff,
      Duration dur,
      Price price) {

    checkNewRouteName(locId, name);

    var route = Route.createRoute(locId, name, comment, dist, diff, dur, price);
    repository.save(route);
    return route;
  }

  public Route findRouteById(RouteId id) {

    return repository.findById(id).orElseThrow(() -> new RouteNotFoundException());
  }

  public Route updateRoute(
      RouteId id,
      String newName,
      String newComment,
      Distance newDist,
      Difficulty newDiff,
      Duration newDur,
      Price newPrice) {

    var route = findRouteById(id);

    if (!route.getName().equals(newName)) checkNewRouteName(route.getLocationId(), newName);

    route.setComment(newComment);
    route.setDifficulty(newDiff);
    route.setDistance(newDist);
    route.setPrice(newPrice);
    route.setDuration(newDur);

    repository.save(route);
    return route;
  }
}
