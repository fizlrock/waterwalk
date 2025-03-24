package dev.fizlrock.waterwalk.application.port.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** UpdateLocationRq */
@AllArgsConstructor
@Getter
public class LocationUpdateRq {
  private final String oldName;
  private final LocationDto location;
}
