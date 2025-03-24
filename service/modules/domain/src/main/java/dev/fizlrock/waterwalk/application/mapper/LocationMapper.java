package dev.fizlrock.waterwalk.application.mapper;

import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.domain.entity.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** LocationMapper */
@Mapper(componentModel = "spring")
public interface LocationMapper {
  LocationDto toDto(Location loc);

  @Mapping(target = "routes", ignore = true)
  Location toDomain(LocationDto loc);
}
