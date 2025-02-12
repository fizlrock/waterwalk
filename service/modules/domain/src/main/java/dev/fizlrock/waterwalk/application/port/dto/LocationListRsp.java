package dev.fizlrock.waterwalk.application.port.dto;

import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;

/** LocationListRsp */
@AllArgsConstructor
public class LocationListRsp {
  private final List<LocationDto> locations;

  public List<LocationDto> getLocations() {
    return Collections.unmodifiableList(locations);
  }
}
