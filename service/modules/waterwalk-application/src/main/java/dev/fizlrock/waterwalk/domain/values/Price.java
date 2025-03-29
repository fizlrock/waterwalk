package dev.fizlrock.waterwalk.domain.values;

/** Price */
public record Price(int rublesCount) {
  public Price(int rublesCount) {
    if (rublesCount <= 0) throw new IllegalArgumentException("Цена должна быль больше ноля");
    this.rublesCount = rublesCount;
  }

  public static Price ofRubles(int price) {
    return new Price(price);
  }

  public static Price ofRubles(long price) {
    return new Price((int) price);
  }

  @Override
  public final String toString() {
    return "%d руб".formatted(rublesCount);
  }
}
