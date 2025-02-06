package dev.fizlrock.waterwalk.domain.entity;

import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import java.time.Duration;
import lombok.Data;
import lombok.NonNull;

@Data
public class Route {

  @NonNull String name;
  @NonNull String comment;
  @NonNull Distance distance;
  @NonNull Difficulty difficulty;
  @NonNull Duration duration;
  @NonNull Price price;
}
