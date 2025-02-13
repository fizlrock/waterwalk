package dev.fizlrock.waterwalk.domain.entity;

import lombok.Getter;

/** Место проведедения мероприятия */
@Getter
public class Location {

  /** Название места */
  private String locationName;

  /** Описание места */
  private String comment;

  // @Getter(AccessLevel.NONE)
  // private final Map<String, Route> routes = new HashMap<>();

  public Location(String name, String comment) {
    setLocationName(name);
    setComment(comment);
  }

  @Override
  public String toString() {
    return locationName + " " + comment;
  }

  // public Collection<Route> getRoutes() {
  //   return Collections.unmodifiableCollection(routes.values());
  // }

  // public void addRoute(Route route) {
  //   if (routes.containsKey(route.getName()))
  //     throw new RouteNameDublicateException(locationName, route.getName());
  //   routes.put(route.getName(), route);
  // }

  // public void deleteRoute(Route route) {
  //   if (!routes.containsKey(route.getName()))
  //     throw new RouteNameNotFoundException(locationName, route.getName());
  //   routes.remove(route.getName());
  // }

  // public void renameRoute(String old_name, String new_name) {
  //   if (!routes.containsKey(old_name)) throw new RouteNameNotFoundException(locationName,
  // old_name);
  //   if (routes.containsKey(new_name)) throw new RouteNameDublicateException(locationName,
  // new_name);

  //   var route = routes.remove(old_name);
  //   route.setName(new_name);
  //   routes.put(new_name, route);
  // }

  public void setLocationName(String name) {
    if (name.isBlank()) throw new IllegalArgumentException("мя локации не может быть пустым");
    this.locationName = name.strip();
  }

  public void setComment(String comment) {
    if (comment.length() > 200)
      throw new IllegalArgumentException("Комментарий к локации не может быть больше 200 символов");
    this.comment = comment.strip();
  }
}
