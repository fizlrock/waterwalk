package dev.fizlrock.waterwalk.application.mapper;

import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.entity.LocationId;
import dev.fizlrock.waterwalk.grpc.api.LocationDto;
import org.mapstruct.Mapper;

/** LocationMapper */
@Mapper(componentModel = "spring")
public interface LocationMapper {
  default LocationDto toDto(Location loc) {
    return LocationDto.newBuilder()
        .setId(loc.getId().toString())
        .setName(loc.getName())
        .setDescription(loc.getComment())
        .build();
  }

  String toDto(LocationId id);
}
