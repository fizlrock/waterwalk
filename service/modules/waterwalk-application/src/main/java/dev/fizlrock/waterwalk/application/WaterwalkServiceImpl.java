package dev.fizlrock.waterwalk.application;

import dev.fizlrock.waterwalk.application.mapper.LocationMapper;
import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.exception.LocationNameDublicateException;
import dev.fizlrock.waterwalk.grpc.api.CreateLocationRq;
import dev.fizlrock.waterwalk.grpc.api.LocationDto;
import dev.fizlrock.waterwalk.grpc.api.RouteDto;
import dev.fizlrock.waterwalk.grpc.api.Void;
import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc.WaterwalkServiceImplBase;
import io.grpc.stub.StreamObserver;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** WaterwalkServiceImpl */
@Component
public class WaterwalkServiceImpl extends WaterwalkServiceImplBase {

  @Autowired ILocationRepository locRepository;
  @Autowired LocationMapper locMapper;

  @Override
  public void getLocationList(Void request, StreamObserver<LocationDto> responseObserver) {
    locRepository.findAll().stream().map(locMapper::toDto).forEach(responseObserver::onNext);
    responseObserver.onCompleted();
  }

  @Override
  public void createLocation(CreateLocationRq request, StreamObserver<Void> responseObserver) {

    String name = request.getName();

    Optional<Location> location = locRepository.findByName(name);
    if (location.isPresent()) throw new LocationNameDublicateException(name);

    var new_loc = new Location(request.getName(), request.getDescription());

    locRepository.save(new_loc);

    responseObserver.onCompleted();
  }

  @Override
  public void getRouteList(Void request, StreamObserver<RouteDto> responseObserver) {
    // TODO Auto-generated method stub
    super.getRouteList(request, responseObserver);
  }
}
