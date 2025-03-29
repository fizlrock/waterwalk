package dev.fizlrock.waterwalk.domain.entity;

import java.util.UUID;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

/** Место проведедения мероприятия */
@Getter
public class Location {

  @Id private final LocationId id;

  /** Название места */
  private String name;

  /** Описание места */
  private String comment = "";

  public Location(String name, String comment) {
    this(new LocationId(UUID.randomUUID()), name, comment);
  }

  @PersistenceCreator
  public Location(LocationId id, String name, String comment) {
    this.id = id;
    setName(name);
    setComment(comment);
  }

  @Override
  public String toString() {
    return name + " " + comment;
  }

  public void setName(String name) {
    if (name.isBlank()) throw new IllegalArgumentException("Имя локации не может быть пустым");
    this.name = name.strip();
  }

  public void setComment(String comment) {
    if (comment.length() > 200)
      throw new IllegalArgumentException("Комментарий к локации не может быть больше 200 символов");
    this.comment = comment.strip();
  }
}
