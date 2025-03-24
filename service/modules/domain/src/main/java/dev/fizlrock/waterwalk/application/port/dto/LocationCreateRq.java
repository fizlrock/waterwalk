package dev.fizlrock.waterwalk.application.port.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LocationCreateRq {
  private final LocationDto location;
}
