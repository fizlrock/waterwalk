package dev.fizlrock.waterwalk.application.mapper;

import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.entity.LocationId;
import dev.fizlrock.waterwalk.grpc.api.LocationDto;
import org.mapstruct.Mapper;

/** LocationMapper */
@Mapper(componentModel = "spring")
public interface LocationMapper {
  LocationDto toDto(Location loc);

  String toDto(LocationId id);
}
