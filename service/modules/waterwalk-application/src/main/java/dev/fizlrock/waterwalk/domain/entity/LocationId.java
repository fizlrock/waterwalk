package dev.fizlrock.waterwalk.domain.entity;

import java.util.UUID;

/** LocationId */
public record LocationId(UUID uuid) {

  @Override
  public final String toString() {
    return uuid.toString();
  }
}
