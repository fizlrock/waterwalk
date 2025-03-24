package dev.fizlrock.waterwalk.domain.entity;

import java.util.Set;
import java.util.UUID;
import lombok.Getter;

/** Место проведедения мероприятия */
@Getter
public class Location {

  private final LocationId id;

  /** Название места */
  private String locationName;

  /** Описание места */
  private String comment;

  private Set<RouteId> routeIds;

  public Location(String locationName, String comment) {
    this(new LocationId(UUID.randomUUID()), locationName, comment);
  }

  public Location(LocationId id, String locationName, String comment) {
    this.id = id;
    setLocationName(locationName);
    setComment(comment);
  }

  @Override
  public String toString() {
    return locationName + " " + comment;
  }

  public void setLocationName(String name) {
    if (name.isBlank()) throw new IllegalArgumentException("Имя локации не может быть пустым");
    this.locationName = name.strip();
  }

  public void setComment(String comment) {
    if (comment.length() > 200)
      throw new IllegalArgumentException("Комментарий к локации не может быть больше 200 символов");
    this.comment = comment.strip();
  }
}
