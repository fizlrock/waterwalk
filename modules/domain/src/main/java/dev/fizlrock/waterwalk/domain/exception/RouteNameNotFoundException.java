package dev.fizlrock.waterwalk.domain.exception;

/** RouteNameNotFoundException */
public class RouteNameNotFoundException extends DomainException {

  public RouteNameNotFoundException(String routeName, String locationName) {
    super("Маршрут с именем %d не найден в локации %d".formatted(routeName, locationName));
  }
}
