package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.repository.RouteRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

/** RouteRepositoryImpl */
@Repository
public class RouteRepositoryImpl implements RouteRepository {

  @Override
  public List<Route> getRoutesWherePlace(String placeName) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRoutesWherePlace'");
  }

  @Override
  public void addRouteToPlace(String placeName, Route route) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addRouteToPlace'");
  }

  @Override
  public void deleteRoute(String placeName, String routeName) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteRoute'");
  }

  @Override
  public void updateRoute(String placeName, String oldRouteName, Route route) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateRoute'");
  }
}
