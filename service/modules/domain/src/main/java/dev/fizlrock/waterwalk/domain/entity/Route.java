package dev.fizlrock.waterwalk.domain.entity;

import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import java.time.Duration;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Route {

  private String name;
  private String comment;
  private Distance distance;
  private Difficulty difficulty;
  private Duration duration;
  private Price price;

  // private Comparator<RoutePlan> plannedRouteComparator =
  //     Comparator.comparing(RoutePlan::getStartTime);

  // private SortedSet<RoutePlan> plans = new TreeSet<>(plannedRouteComparator);

  // public RoutePlan planRoute(Instant time) {
  //   var plan = new RoutePlan(time);

  //   var before_times = plans.headSet(plan);
  //   var after_times = plans.tailSet(plan);

  //   if (!before_times.isEmpty()) {
  //     var before_time = before_times.last().getStartTime().plus(duration);
  //     if (time.isBefore(before_time)) throw new TimeConflictException(time, before_time);
  //   }

  //   if (!after_times.isEmpty()) {
  //     var after_time = after_times.first().getStartTime();
  //     if (time.plus(duration).isAfter(after_time))
  //       throw new TimeConflictException(time, after_time);
  //   }

  //   plans.add(plan);
  //   return plan;
  // }

  /**
   * Установка имени должна осуществлятся только через объект Place
   *
   * @param name
   */
  void setName(String name) {
    this.name = name;
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
}
