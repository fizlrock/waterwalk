package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.domain.entity.Route;
import java.util.List;

/** RouteRepository */
public interface IRouteRepository {

  List<Route> getRoutesWherePlace(String placeName);

  void addRouteToPlace(String placeName, Route route);

  void deleteRoute(String placeName, String routeName);

  void updateRoute(String placeName, String oldRouteName, Route route);
}
