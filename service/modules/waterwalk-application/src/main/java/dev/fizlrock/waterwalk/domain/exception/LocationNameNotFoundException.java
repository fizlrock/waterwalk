package dev.fizlrock.waterwalk.domain.exception;

/** LocationNameNotFoundException */
public class LocationNameNotFoundException extends DomainException {

  private final String locationName;

  public LocationNameNotFoundException(String locationName) {
    this.locationName = locationName;
  }

  @Override
  public String getMessage() {
    return "Локация с именем %s не найдена".formatted(locationName);
  }
}
