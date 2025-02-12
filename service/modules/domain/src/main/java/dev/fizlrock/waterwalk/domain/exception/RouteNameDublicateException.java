package dev.fizlrock.waterwalk.domain.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/** RouteNameDublicateException */
@Getter
@RequiredArgsConstructor
public class RouteNameDublicateException extends DomainException {
  private final String placeName, routeName;

  @Override
  public String getMessage() {
    return "Место <%s> уже содержит маршрут с именем <%s>".formatted(placeName, routeName);
  }
}
