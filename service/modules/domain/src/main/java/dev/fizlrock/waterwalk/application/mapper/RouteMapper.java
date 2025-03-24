package dev.fizlrock.waterwalk.application.mapper;

import dev.fizlrock.waterwalk.application.port.dto.RouteDto;
import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import java.time.Duration;
import org.mapstruct.Mapper;

/** RouteMapper */
@Mapper(componentModel = "spring")
public interface RouteMapper {

  public default RouteDto toDto(Route entity) {

    return new RouteDto(
        entity.getName(),
        entity.getComment(),
        entity.getDistance().inMeters(),
        entity.getDifficulty().name(),
        (int) entity.getDuration().toMinutes(),
        entity.getPrice().rublesCount());
  }

  public default Route toDomain(RouteDto dto) {

    return new Route(
        dto.name(),
        dto.comment(),
        Distance.ofMeters(dto.distance()),
        Difficulty.valueOf(dto.difficulty()),
        Duration.ofMinutes(dto.duration()),
        Price.ofRubles(dto.price()));
  }
}
