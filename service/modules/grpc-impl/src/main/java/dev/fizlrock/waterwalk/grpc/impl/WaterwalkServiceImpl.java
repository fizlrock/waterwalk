package dev.fizlrock.waterwalk.grpc.impl;

import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.domain.service.PlaceService;
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

  @Autowired PlaceService placeService;

  @Override
  public void getLocationList(SkipLimit request, StreamObserver<Location> responseObserver) {
    var places = placeService.getAllPlaces((int) request.getSkip(), (int) request.getLimit());
    places.stream()
        .map(p -> Location.newBuilder().setName(p.getName()).setDescription(p.getComment()).build())
        .forEach(responseObserver::onNext);
    responseObserver.onCompleted();
  }

  @Override
  public void createLocation(
      Location request, StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
    Place place = new Place(request.getName(), request.getDescription());
    placeService.saveNew(place);

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void deleteLocation(
      DeleteLocationRq request, io.grpc.stub.StreamObserver<Void> responseObserver) {

    placeService.deleteByName(request.getLocationName());

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void updateLocation(
      UpdateLocationRq request, io.grpc.stub.StreamObserver<Void> responseObserver) {

    var location = request.getLocation();
    var place = new Place(location.getName(), location.getDescription());

    placeService.updateExisting(request.getOldName(), place);

    responseObserver.onNext(Void.newBuilder().build());
    responseObserver.onCompleted();
  }
}
