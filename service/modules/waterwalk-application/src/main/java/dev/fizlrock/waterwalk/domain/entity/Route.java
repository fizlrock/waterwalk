package dev.fizlrock.waterwalk.domain.entity;

import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import java.time.Duration;
import java.util.UUID;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Getter
public class Route {

  @Id private final RouteId id;

  private LocationId locationId;

  private String name;
  private String comment;

  private Distance distance;

  private Difficulty difficulty;
  private Duration duration;
  private Price price;

  public static Route createRoute(
      LocationId locId,
      String name,
      String comment,
      Distance dist,
      Difficulty difficulty,
      Duration duration,
      Price price) {

    return new Route(
        new RouteId(UUID.randomUUID()), locId, name, comment, dist, difficulty, duration, price);
  }

  @PersistenceCreator
  private Route(
      RouteId id,
      LocationId locId,
      String name,
      String comment,
      Distance dist,
      Difficulty difficulty,
      Duration duration,
      Price price) {

    this.id = id;
    locationId = locId;
    setName(name);
    setComment(comment);
    setDistance(dist);
    setDifficulty(difficulty);
    setDuration(duration);
    setPrice(price);
  }

  public void setComment(String comment) {
    // TODO check
    this.comment = comment;
  }

  public void setDistance(Distance distance) {
    this.distance = distance;
  }

  public void setDifficulty(Difficulty difficulty) {
    this.difficulty = difficulty;
  }

  public void setDuration(Duration duration) {
    // TODO проверить, не будет ли пересекатся расписание
    this.duration = duration;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  protected void setLocationId(LocationId locationId) {
    this.locationId = locationId;
  }

  public void setName(String name) {
    this.name = name;
  }
}
