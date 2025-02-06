package dev.fizlrock.waterwalk.domain.values;

/** Расстояние в метрах */
public final class Distance {

  private final Long distance;

  public Distance(Long distanceInMeters) {
    if (distanceInMeters <= 0)
      throw new IllegalArgumentException("Дистанция должна быть больше нуля");
    this.distance = distanceInMeters;
  }

  public static Distance ofMeters(long distanceInMeters) {
    return new Distance(distanceInMeters);
  }

  public static Distance ofKMeters(long distanceInKMeters) {
    return new Distance(distanceInKMeters * 1000);
  }

  public Long inMeters() {
    return distance;
  }

  @Override
  public String toString() {
    return "%d m".formatted(distance);
  }
}
