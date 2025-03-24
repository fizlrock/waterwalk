package dev.fizlrock.waterwalk.domain.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/** LocationNameDublicateException */
@Getter
@RequiredArgsConstructor
public class LocationNameDublicateException extends DomainException {

  private final String locationName;

  @Override
  public String getMessage() {
    return "Локация с именем %s уже существует".formatted(locationName);
  }
}
