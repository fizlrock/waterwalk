package dev.fizlrock.waterwalk.grpc.impl;

import dev.fizlrock.waterwalk.application.port.IWaterwalkService;
import dev.fizlrock.waterwalk.application.port.dto.CreateLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.GetLocationListRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.grpc.api.DeleteLocationRq;
import dev.fizlrock.waterwalk.grpc.api.Location;
import dev.fizlrock.waterwalk.grpc.api.SkipLimit;
import dev.fizlrock.waterwalk.grpc.api.UpdateLocationRq;
import dev.fizlrock.waterwalk.grpc.api.Void;
import dev.fizlrock.waterwalk.grpc.api.WaterwalkServiceGrpc.WaterwalkServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/** WaterwalkServiceImpl */
@GrpcService
public class WaterwalkServiceImpl extends WaterwalkServiceImplBase {

  @Autowired IWaterwalkService service;

  @Override
  public void createLocation(Location request, StreamObserver<Void> responseObserver) {

    var location_dto = new LocationDto(request.getName(), request.getDescription());
    var domain_request = new CreateLocationRq(location_dto);
    service.createLocaton(domain_request);

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void updateLocation(UpdateLocationRq request, StreamObserver<Void> responseObserver) {
    var old_name = request.getOldName();
    var nloc = request.getLocation();

    var new_location_dto = new LocationDto(nloc.getName(), nloc.getDescription());

    var domain_request =
        new dev.fizlrock.waterwalk.application.port.dto.UpdateLocationRq(
            old_name, new_location_dto);

    service.updateLocaton(domain_request);

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void deleteLocation(DeleteLocationRq request, StreamObserver<Void> responseObserver) {

    var name = request.getLocationName();

    service.deleteLocaton(new dev.fizlrock.waterwalk.application.port.dto.DeleteLocationRq(name));

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void getLocationList(SkipLimit request, StreamObserver<Location> responseObserver) {

    var resp =
        service.getLocationList(new GetLocationListRq(request.getSkip(), request.getLimit()));

    resp.getLocations().stream()
        .map(
            l ->
                Location.newBuilder()
                    .setName(l.getLocationName())
                    .setDescription(l.getComment())
                    .build())
        .forEach(responseObserver::onNext);
    responseObserver.onCompleted();
  }
}
