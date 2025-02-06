package dev.fizlrock.waterwalk.domain.exception;

/** LocationNameNotFoundException */
public class LocationNameNotFoundException extends DomainException {

  public LocationNameNotFoundException(String locationName) {
    super("Локация с именем %s не найдена".formatted(locationName));
    // TODO Auto-generated constructor stub
  }
}
