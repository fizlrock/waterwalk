package dev.fizlrock.waterwalk.domain.exception;

/** LocationNameNotFoundException */
public class PlaceNameNotFoundException extends DomainException {

  private final String locationName;

  public PlaceNameNotFoundException(String locationName) {
    this.locationName = locationName;
  }

  @Override
  public String getMessage() {
    return "Локация с именем %s не найдена".formatted(locationName);
  }
}
