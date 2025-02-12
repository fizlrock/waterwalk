package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.dao.jdbc.RouteEntityRepository;
import dev.fizlrock.waterwalk.dao.mapper.RouteMapper;
import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.port.input.RouteRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/** RouteRepositoryImpl */
@Repository
@RequiredArgsConstructor
public class RouteRepositoryImpl implements RouteRepository {

  private final RouteMapper mapper;
  private final RouteEntityRepository entityRepository;

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
