package dev.fizlrock.waterwalk.application.port.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** DeleteLocationRq */
@AllArgsConstructor
@Getter
public class LocationDeleteRq {
  String locationName;
}
