package dev.fizlrock.waterwalk.domain.exception;

/** LocationNameDublicateException */
public class LocationNameDublicateException extends DomainException {

  public LocationNameDublicateException(String locationName) {
    super("Локация с именем %s уже существует".formatted(locationName));
    // TODO Auto-generated constructor stub
  }
}
