package dev.fizlrock.waterwalk.domain.exception;

/** RouteNameDublicateException */
public class RouteNameDublicateException extends DomainException {

  public RouteNameDublicateException(String text) {
    super("Место уже содержит маршрут с именем %s".formatted(text));
  }
}
