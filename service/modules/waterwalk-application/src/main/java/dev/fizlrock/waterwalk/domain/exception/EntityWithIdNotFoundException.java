package dev.fizlrock.waterwalk.domain.exception;

/** EntityWithIdNotFoundException */
public abstract class EntityWithIdNotFoundException extends DomainException {

  private final String entityName;

  public EntityWithIdNotFoundException(String entityName) {
    this.entityName = entityName;
  }

  @Override
  public String getMessage() {
    return "Ресурс <" + entityName + "> с указанным id не наден";
  }

  public static class LocationWithIdNotFoundException extends EntityWithIdNotFoundException {

    public LocationWithIdNotFoundException() {
      super("Локация");
    }
  }

  public static class RouteWithIdNotFoundException extends EntityWithIdNotFoundException {

    public RouteWithIdNotFoundException() {
      super("Маршрут");
    }
  }
}
