package dev.fizlrock.waterwalk.domain.exception;

import lombok.RequiredArgsConstructor;

/** RouteNameNotFoundException */
@RequiredArgsConstructor
public class RouteNameNotFoundException extends DomainException {

  private final String routeName, locationName;

  @Override
  public String getMessage() {
    return "Маршрут с именем %d не найден в локации %d".formatted(routeName, locationName);
  }
}
