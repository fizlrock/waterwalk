package dev.fizlrock.waterwalk.application.mapper;

import dev.fizlrock.waterwalk.domain.entity.LocationId;
import dev.fizlrock.waterwalk.domain.entity.Route;
import dev.fizlrock.waterwalk.domain.entity.RouteId;
import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import dev.fizlrock.waterwalk.grpc.api.RouteDifficulty;
import dev.fizlrock.waterwalk.grpc.api.RouteDto;
import java.time.Duration;
import org.mapstruct.Mapper;

/** RouteMapper */
@Mapper(componentModel = "spring")
public interface RouteMapper {

  RouteDto toDto(Route r);

  default long toDto(Distance dist) {
    return dist.inMeters();
  }

  default String toDto(LocationId id) {
    return id.uuid().toString();
  }

  default long toDto(Price price) {
    return price.rublesCount();
  }

  default RouteDifficulty toDto(Difficulty diff) {
    return RouteDifficulty.forNumber(diff.ordinal());
  }

  default long toDto(Duration dur) {
    return dur.toMinutes();
  }

  default String toDto(RouteId id) {
    return id.toString();
  }
}
