package dev.fizlrock.waterwalk.application;

import dev.fizlrock.waterwalk.application.mapper.LocationMapper;
import dev.fizlrock.waterwalk.application.mapper.RouteMapper;
import dev.fizlrock.waterwalk.domain.entity.LocationId;
import dev.fizlrock.waterwalk.domain.service.LocationService;
import dev.fizlrock.waterwalk.domain.service.RouteService;
import dev.fizlrock.waterwalk.domain.values.Difficulty;
import dev.fizlrock.waterwalk.domain.values.Distance;
import dev.fizlrock.waterwalk.domain.values.Price;
import dev.fizlrock.waterwalk.grpc.api.CreateLocationRq;
import dev.fizlrock.waterwalk.grpc.api.CreateRouteRq;
import dev.fizlrock.waterwalk.grpc.api.LocationDto;
import dev.fizlrock.waterwalk.grpc.api.RouteDto;
import dev.fizlrock.waterwalk.grpc.api.Void;
import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc.WaterwalkServiceImplBase;
import io.grpc.stub.StreamObserver;
import java.time.Duration;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@GrpcService
public class WaterwalkServiceImpl extends WaterwalkServiceImplBase {

  @Autowired LocationService locService;
  @Autowired LocationMapper locMapper;

  @Autowired RouteService routeService;
  @Autowired RouteMapper routeMapper;

  @Override
  public void getLocationList(Void request, StreamObserver<LocationDto> responseObserver) {
    locService.getLocationList().stream().map(locMapper::toDto).forEach(responseObserver::onNext);
    responseObserver.onCompleted();
  }

  @Override
  public void createLocation(
      CreateLocationRq request, StreamObserver<LocationDto> responseObserver) {
    var loc = locService.createLocation(request.getName(), request.getDescription());

    var locDto = locMapper.toDto(loc);
    log.info("Создана локация: {}", locDto);

    responseObserver.onNext(locDto);
    responseObserver.onCompleted();
  }

  @Override
  public void updateLocation(LocationDto request, StreamObserver<Void> responseObserver) {

    locService.updateLocation(
        new LocationId(UUID.fromString(request.getId())),
        request.getName(),
        request.getDescription());

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void deleteLocation(
      dev.fizlrock.waterwalk.grpc.api.LocationId request, StreamObserver<Void> responseObserver) {

    var uuid = UUID.fromString(request.getId());
    var loc_id = new LocationId(uuid);

    locService.deleteLocation(loc_id);
    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void createRoute(CreateRouteRq request, StreamObserver<RouteDto> responseObserver) {

    var uuid = UUID.fromString(request.getLocationId());
    var loc_id = new LocationId(uuid);

    var route =
        routeService.createRoute(
            loc_id,
            request.getName(),
            request.getComment(),
            Distance.ofMeters(request.getDistance()),
            Difficulty.values()[request.getDifficulty().ordinal()],
            Duration.ofMinutes(request.getDuration()),
            Price.ofRubles(request.getPrice()));

    var dto = routeMapper.toDto(route);
    responseObserver.onNext(dto);
    responseObserver.onCompleted();
  }
}
