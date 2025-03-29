package dev.fizlrock.waterwalk.domain.exception;

/** RouteNotFoundException */
public class RouteNotFoundException extends EntityWithIdNotFoundException {

  public RouteNotFoundException() {
    super("Маршрут");
  }
}
