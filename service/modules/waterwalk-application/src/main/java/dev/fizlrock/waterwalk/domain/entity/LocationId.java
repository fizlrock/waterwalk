package dev.fizlrock.waterwalk.domain.entity;

import java.util.UUID;

/** LocationId */
public record LocationId(UUID locationId) {

  @Override
  public final String toString() {
    return locationId.toString();
  }
}
