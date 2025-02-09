package dev.fizlrock.waterwalk.dao.mapper;

import dev.fizlrock.waterwalk.dao.entity.PlaceEntity;
import dev.fizlrock.waterwalk.domain.entity.Place;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlaceMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(source = "comment", target = "description")
  PlaceEntity toEntity(Place p);

  @Mapping(source = "description", target = "comment")
  Place toDomain(PlaceEntity entity);
}
