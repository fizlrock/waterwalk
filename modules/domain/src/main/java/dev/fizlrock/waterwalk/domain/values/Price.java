package dev.fizlrock.waterwalk.domain.values;

/** Price */
public record Price(Long price) {
  public Price(Long price) {
    if (price <= 0) throw new IllegalArgumentException("Цена должна быль больше ноля");
    this.price = price;
  }

  public static Price ofRubles(long price) {
    return new Price(price);
  }

  @Override
  public final String toString() {
    return "%d руб".formatted(price);
  }
}
