package dev.fizlrock.waterwalk.domain.entity;

import lombok.Data;
import lombok.NonNull;

/** Место проведедения мероприятия */
@Data
public class Place {

  /** Название места */
  private @NonNull String name;

  /** Описание места */
  private @NonNull String comment;

  public void setName(String name) {
    if (name.isBlank()) throw new IllegalArgumentException("Имя локации не может быть пустым");
    this.name = name;
  }

  public void setComment(String comment) {
    if (comment.length() > 200)
      throw new IllegalArgumentException("Комментарий к локации не может быть больше 200 символов");
    this.comment = comment;
  }
}
