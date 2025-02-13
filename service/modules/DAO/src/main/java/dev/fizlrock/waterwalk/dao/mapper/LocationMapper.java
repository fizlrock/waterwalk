package dev.fizlrock.waterwalk.dao.mapper;

import dev.fizlrock.waterwalk.dao.entity.LocationEntity;
import dev.fizlrock.waterwalk.domain.entity.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LocationMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(source = "comment", target = "description")
  @Mapping(source = "locationName", target = "name")
  LocationEntity toEntity(Location p);

  @Mapping(source = "description", target = "comment")
  @Mapping(source = "name", target = "locationName")
  Location toDomain(LocationEntity entity);
}
