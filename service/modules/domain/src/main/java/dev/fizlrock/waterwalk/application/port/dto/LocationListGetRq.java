package dev.fizlrock.waterwalk.application.port.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** GetLocationListRq */
@AllArgsConstructor
@Getter
public class LocationListGetRq {
  private final long skip, limit;
}
