package dev.fizlrock.waterwalk.domain.entity;

import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import java.time.Duration;
import lombok.Data;

@Data
public class Route {

  String name;
  String comment;
  Distance distance;
  Difficulty difficulty;
  Duration duration;
  Price price;
}
