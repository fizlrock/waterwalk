package dev.fizlrock.waterwalk.grpc.impl;

import dev.fizlrock.waterwalk.domain.port.output.PlaceService;
import dev.fizlrock.waterwalk.grpc.api.Location;
import dev.fizlrock.waterwalk.grpc.api.SkipLimit;
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

    var location = Location.newBuilder().setName("sosat").setDescription("otososi").build();

    responseObserver.onNext(location);

    responseObserver.onCompleted();
  }
}
