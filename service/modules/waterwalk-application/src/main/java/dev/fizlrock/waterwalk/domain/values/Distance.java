package dev.fizlrock.waterwalk.domain.values;

/** Расстояние в метрах */
public final class Distance {

  private final int distance;

  public Distance(int distanceInMeters) {
    if (distanceInMeters <= 0)
      throw new IllegalArgumentException("Дистанция должна быть больше нуля");
    this.distance = distanceInMeters;
  }

  public static Distance ofMeters(int distanceInMeters) {
    return new Distance(distanceInMeters);
  }

  public static Distance ofKMeters(int distanceInKMeters) {
    return new Distance(distanceInKMeters * 1000);
  }

  public int inMeters() {
    return distance;
  }

  @Override
  public String toString() {
    return "%d m".formatted(distance);
  }
}
