package dev.fizlrock.waterwalk.domain.exception;

import lombok.RequiredArgsConstructor;

/** PlaceHasRoutesException */
@RequiredArgsConstructor
public class LocationHasRoutesException extends DomainException {
  private final String placeName;

  @Override
  public String getMessage() {
    return "Нельзя удалить место <%s>, оно содержит маршруты".formatted(placeName);
  }
}
