package dev.fizlrock.waterwalk.application.port.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LocationDto {
  /** Название места */
  private final String locationName;

  /** Описание места */
  private final String comment;
}
