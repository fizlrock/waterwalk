package dev.fizlrock.waterwalk.grpc.mapper;

import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.grpc.api.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

// Place - name, comment
// Location - name, description
@Mapper(componentModel = "spring")
public interface PlaceMapper {

  public default Location toDto(Place p) {
    return Location.newBuilder().setName(p.getName()).setDescription(p.getComment()).build();
  }

  @Mapping(source = "description", target = "comment")
  public Place toDomain(Location loc);
}
