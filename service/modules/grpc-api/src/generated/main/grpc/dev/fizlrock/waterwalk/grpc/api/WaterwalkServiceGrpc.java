package dev.fizlrock.waterwalk.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Определяем gRPC-сервис
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: contract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WaterwalkServiceGrpc {

  private WaterwalkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "dev.fizlrock.waterwalk.grpc.WaterwalkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Void,
      dev.fizlrock.waterwalk.grpc.api.LocationDto> getGetLocationListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocationList",
      requestType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.LocationDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Void,
      dev.fizlrock.waterwalk.grpc.api.LocationDto> getGetLocationListMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Void, dev.fizlrock.waterwalk.grpc.api.LocationDto> getGetLocationListMethod;
    if ((getGetLocationListMethod = WaterwalkServiceGrpc.getGetLocationListMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getGetLocationListMethod = WaterwalkServiceGrpc.getGetLocationListMethod) == null) {
          WaterwalkServiceGrpc.getGetLocationListMethod = getGetLocationListMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.Void, dev.fizlrock.waterwalk.grpc.api.LocationDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLocationList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.LocationDto.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("getLocationList"))
              .build();
        }
      }
    }
    return getGetLocationListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.CreateLocationRq,
      dev.fizlrock.waterwalk.grpc.api.Void> getCreateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createLocation",
      requestType = dev.fizlrock.waterwalk.grpc.api.CreateLocationRq.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.CreateLocationRq,
      dev.fizlrock.waterwalk.grpc.api.Void> getCreateLocationMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.CreateLocationRq, dev.fizlrock.waterwalk.grpc.api.Void> getCreateLocationMethod;
    if ((getCreateLocationMethod = WaterwalkServiceGrpc.getCreateLocationMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getCreateLocationMethod = WaterwalkServiceGrpc.getCreateLocationMethod) == null) {
          WaterwalkServiceGrpc.getCreateLocationMethod = getCreateLocationMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.CreateLocationRq, dev.fizlrock.waterwalk.grpc.api.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.CreateLocationRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("createLocation"))
              .build();
        }
      }
    }
    return getCreateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Id,
      dev.fizlrock.waterwalk.grpc.api.Void> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLocation",
      requestType = dev.fizlrock.waterwalk.grpc.api.Id.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Id,
      dev.fizlrock.waterwalk.grpc.api.Void> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Id, dev.fizlrock.waterwalk.grpc.api.Void> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = WaterwalkServiceGrpc.getDeleteLocationMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getDeleteLocationMethod = WaterwalkServiceGrpc.getDeleteLocationMethod) == null) {
          WaterwalkServiceGrpc.getDeleteLocationMethod = getDeleteLocationMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.Id, dev.fizlrock.waterwalk.grpc.api.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("deleteLocation"))
              .build();
        }
      }
    }
    return getDeleteLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.LocationDto,
      dev.fizlrock.waterwalk.grpc.api.Void> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLocation",
      requestType = dev.fizlrock.waterwalk.grpc.api.LocationDto.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.LocationDto,
      dev.fizlrock.waterwalk.grpc.api.Void> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.LocationDto, dev.fizlrock.waterwalk.grpc.api.Void> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = WaterwalkServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getUpdateLocationMethod = WaterwalkServiceGrpc.getUpdateLocationMethod) == null) {
          WaterwalkServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.LocationDto, dev.fizlrock.waterwalk.grpc.api.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.LocationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("updateLocation"))
              .build();
        }
      }
    }
    return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Void,
      dev.fizlrock.waterwalk.grpc.api.RouteDto> getGetRouteListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRouteList",
      requestType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.RouteDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Void,
      dev.fizlrock.waterwalk.grpc.api.RouteDto> getGetRouteListMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Void, dev.fizlrock.waterwalk.grpc.api.RouteDto> getGetRouteListMethod;
    if ((getGetRouteListMethod = WaterwalkServiceGrpc.getGetRouteListMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getGetRouteListMethod = WaterwalkServiceGrpc.getGetRouteListMethod) == null) {
          WaterwalkServiceGrpc.getGetRouteListMethod = getGetRouteListMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.Void, dev.fizlrock.waterwalk.grpc.api.RouteDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRouteList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.RouteDto.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("getRouteList"))
              .build();
        }
      }
    }
    return getGetRouteListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.CreateRouteRq,
      dev.fizlrock.waterwalk.grpc.api.Void> getCreateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRoute",
      requestType = dev.fizlrock.waterwalk.grpc.api.CreateRouteRq.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.CreateRouteRq,
      dev.fizlrock.waterwalk.grpc.api.Void> getCreateRouteMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.CreateRouteRq, dev.fizlrock.waterwalk.grpc.api.Void> getCreateRouteMethod;
    if ((getCreateRouteMethod = WaterwalkServiceGrpc.getCreateRouteMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getCreateRouteMethod = WaterwalkServiceGrpc.getCreateRouteMethod) == null) {
          WaterwalkServiceGrpc.getCreateRouteMethod = getCreateRouteMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.CreateRouteRq, dev.fizlrock.waterwalk.grpc.api.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.CreateRouteRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("createRoute"))
              .build();
        }
      }
    }
    return getCreateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Id,
      dev.fizlrock.waterwalk.grpc.api.Void> getDeleteRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRoute",
      requestType = dev.fizlrock.waterwalk.grpc.api.Id.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Id,
      dev.fizlrock.waterwalk.grpc.api.Void> getDeleteRouteMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.Id, dev.fizlrock.waterwalk.grpc.api.Void> getDeleteRouteMethod;
    if ((getDeleteRouteMethod = WaterwalkServiceGrpc.getDeleteRouteMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getDeleteRouteMethod = WaterwalkServiceGrpc.getDeleteRouteMethod) == null) {
          WaterwalkServiceGrpc.getDeleteRouteMethod = getDeleteRouteMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.Id, dev.fizlrock.waterwalk.grpc.api.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("deleteRoute"))
              .build();
        }
      }
    }
    return getDeleteRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.RouteDto,
      dev.fizlrock.waterwalk.grpc.api.Void> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRoute",
      requestType = dev.fizlrock.waterwalk.grpc.api.RouteDto.class,
      responseType = dev.fizlrock.waterwalk.grpc.api.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.RouteDto,
      dev.fizlrock.waterwalk.grpc.api.Void> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<dev.fizlrock.waterwalk.grpc.api.RouteDto, dev.fizlrock.waterwalk.grpc.api.Void> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = WaterwalkServiceGrpc.getUpdateRouteMethod) == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        if ((getUpdateRouteMethod = WaterwalkServiceGrpc.getUpdateRouteMethod) == null) {
          WaterwalkServiceGrpc.getUpdateRouteMethod = getUpdateRouteMethod =
              io.grpc.MethodDescriptor.<dev.fizlrock.waterwalk.grpc.api.RouteDto, dev.fizlrock.waterwalk.grpc.api.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.RouteDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.fizlrock.waterwalk.grpc.api.Void.getDefaultInstance()))
              .setSchemaDescriptor(new WaterwalkServiceMethodDescriptorSupplier("updateRoute"))
              .build();
        }
      }
    }
    return getUpdateRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterwalkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterwalkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterwalkServiceStub>() {
        @java.lang.Override
        public WaterwalkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterwalkServiceStub(channel, callOptions);
        }
      };
    return WaterwalkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterwalkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterwalkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterwalkServiceBlockingStub>() {
        @java.lang.Override
        public WaterwalkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterwalkServiceBlockingStub(channel, callOptions);
        }
      };
    return WaterwalkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterwalkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WaterwalkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WaterwalkServiceFutureStub>() {
        @java.lang.Override
        public WaterwalkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WaterwalkServiceFutureStub(channel, callOptions);
        }
      };
    return WaterwalkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Определяем gRPC-сервис
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Location CRUD
     * </pre>
     */
    default void getLocationList(dev.fizlrock.waterwalk.grpc.api.Void request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.LocationDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationListMethod(), responseObserver);
    }

    /**
     */
    default void createLocation(dev.fizlrock.waterwalk.grpc.api.CreateLocationRq request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationMethod(), responseObserver);
    }

    /**
     */
    default void deleteLocation(dev.fizlrock.waterwalk.grpc.api.Id request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    /**
     */
    default void updateLocation(dev.fizlrock.waterwalk.grpc.api.LocationDto request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    default void getRouteList(dev.fizlrock.waterwalk.grpc.api.Void request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.RouteDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRouteListMethod(), responseObserver);
    }

    /**
     */
    default void createRoute(dev.fizlrock.waterwalk.grpc.api.CreateRouteRq request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRouteMethod(), responseObserver);
    }

    /**
     */
    default void deleteRoute(dev.fizlrock.waterwalk.grpc.api.Id request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRouteMethod(), responseObserver);
    }

    /**
     */
    default void updateRoute(dev.fizlrock.waterwalk.grpc.api.RouteDto request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WaterwalkService.
   * <pre>
   * Определяем gRPC-сервис
   * </pre>
   */
  public static abstract class WaterwalkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WaterwalkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WaterwalkService.
   * <pre>
   * Определяем gRPC-сервис
   * </pre>
   */
  public static final class WaterwalkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WaterwalkServiceStub> {
    private WaterwalkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterwalkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterwalkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Location CRUD
     * </pre>
     */
    public void getLocationList(dev.fizlrock.waterwalk.grpc.api.Void request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.LocationDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetLocationListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLocation(dev.fizlrock.waterwalk.grpc.api.CreateLocationRq request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLocation(dev.fizlrock.waterwalk.grpc.api.Id request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(dev.fizlrock.waterwalk.grpc.api.LocationDto request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRouteList(dev.fizlrock.waterwalk.grpc.api.Void request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.RouteDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetRouteListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRoute(dev.fizlrock.waterwalk.grpc.api.CreateRouteRq request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRoute(dev.fizlrock.waterwalk.grpc.api.Id request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoute(dev.fizlrock.waterwalk.grpc.api.RouteDto request,
        io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WaterwalkService.
   * <pre>
   * Определяем gRPC-сервис
   * </pre>
   */
  public static final class WaterwalkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WaterwalkServiceBlockingStub> {
    private WaterwalkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterwalkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterwalkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Location CRUD
     * </pre>
     */
    public java.util.Iterator<dev.fizlrock.waterwalk.grpc.api.LocationDto> getLocationList(
        dev.fizlrock.waterwalk.grpc.api.Void request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetLocationListMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.fizlrock.waterwalk.grpc.api.Void createLocation(dev.fizlrock.waterwalk.grpc.api.CreateLocationRq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.fizlrock.waterwalk.grpc.api.Void deleteLocation(dev.fizlrock.waterwalk.grpc.api.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.fizlrock.waterwalk.grpc.api.Void updateLocation(dev.fizlrock.waterwalk.grpc.api.LocationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dev.fizlrock.waterwalk.grpc.api.RouteDto> getRouteList(
        dev.fizlrock.waterwalk.grpc.api.Void request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetRouteListMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.fizlrock.waterwalk.grpc.api.Void createRoute(dev.fizlrock.waterwalk.grpc.api.CreateRouteRq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.fizlrock.waterwalk.grpc.api.Void deleteRoute(dev.fizlrock.waterwalk.grpc.api.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.fizlrock.waterwalk.grpc.api.Void updateRoute(dev.fizlrock.waterwalk.grpc.api.RouteDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WaterwalkService.
   * <pre>
   * Определяем gRPC-сервис
   * </pre>
   */
  public static final class WaterwalkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WaterwalkServiceFutureStub> {
    private WaterwalkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterwalkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WaterwalkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.fizlrock.waterwalk.grpc.api.Void> createLocation(
        dev.fizlrock.waterwalk.grpc.api.CreateLocationRq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.fizlrock.waterwalk.grpc.api.Void> deleteLocation(
        dev.fizlrock.waterwalk.grpc.api.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.fizlrock.waterwalk.grpc.api.Void> updateLocation(
        dev.fizlrock.waterwalk.grpc.api.LocationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.fizlrock.waterwalk.grpc.api.Void> createRoute(
        dev.fizlrock.waterwalk.grpc.api.CreateRouteRq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.fizlrock.waterwalk.grpc.api.Void> deleteRoute(
        dev.fizlrock.waterwalk.grpc.api.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.fizlrock.waterwalk.grpc.api.Void> updateRoute(
        dev.fizlrock.waterwalk.grpc.api.RouteDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION_LIST = 0;
  private static final int METHODID_CREATE_LOCATION = 1;
  private static final int METHODID_DELETE_LOCATION = 2;
  private static final int METHODID_UPDATE_LOCATION = 3;
  private static final int METHODID_GET_ROUTE_LIST = 4;
  private static final int METHODID_CREATE_ROUTE = 5;
  private static final int METHODID_DELETE_ROUTE = 6;
  private static final int METHODID_UPDATE_ROUTE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION_LIST:
          serviceImpl.getLocationList((dev.fizlrock.waterwalk.grpc.api.Void) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.LocationDto>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION:
          serviceImpl.createLocation((dev.fizlrock.waterwalk.grpc.api.CreateLocationRq) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((dev.fizlrock.waterwalk.grpc.api.Id) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((dev.fizlrock.waterwalk.grpc.api.LocationDto) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void>) responseObserver);
          break;
        case METHODID_GET_ROUTE_LIST:
          serviceImpl.getRouteList((dev.fizlrock.waterwalk.grpc.api.Void) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.RouteDto>) responseObserver);
          break;
        case METHODID_CREATE_ROUTE:
          serviceImpl.createRoute((dev.fizlrock.waterwalk.grpc.api.CreateRouteRq) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void>) responseObserver);
          break;
        case METHODID_DELETE_ROUTE:
          serviceImpl.deleteRoute((dev.fizlrock.waterwalk.grpc.api.Id) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((dev.fizlrock.waterwalk.grpc.api.RouteDto) request,
              (io.grpc.stub.StreamObserver<dev.fizlrock.waterwalk.grpc.api.Void>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetLocationListMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.Void,
              dev.fizlrock.waterwalk.grpc.api.LocationDto>(
                service, METHODID_GET_LOCATION_LIST)))
        .addMethod(
          getCreateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.CreateLocationRq,
              dev.fizlrock.waterwalk.grpc.api.Void>(
                service, METHODID_CREATE_LOCATION)))
        .addMethod(
          getDeleteLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.Id,
              dev.fizlrock.waterwalk.grpc.api.Void>(
                service, METHODID_DELETE_LOCATION)))
        .addMethod(
          getUpdateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.LocationDto,
              dev.fizlrock.waterwalk.grpc.api.Void>(
                service, METHODID_UPDATE_LOCATION)))
        .addMethod(
          getGetRouteListMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.Void,
              dev.fizlrock.waterwalk.grpc.api.RouteDto>(
                service, METHODID_GET_ROUTE_LIST)))
        .addMethod(
          getCreateRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.CreateRouteRq,
              dev.fizlrock.waterwalk.grpc.api.Void>(
                service, METHODID_CREATE_ROUTE)))
        .addMethod(
          getDeleteRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.Id,
              dev.fizlrock.waterwalk.grpc.api.Void>(
                service, METHODID_DELETE_ROUTE)))
        .addMethod(
          getUpdateRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.fizlrock.waterwalk.grpc.api.RouteDto,
              dev.fizlrock.waterwalk.grpc.api.Void>(
                service, METHODID_UPDATE_ROUTE)))
        .build();
  }

  private static abstract class WaterwalkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterwalkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.fizlrock.waterwalk.grpc.api.Contract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterwalkService");
    }
  }

  private static final class WaterwalkServiceFileDescriptorSupplier
      extends WaterwalkServiceBaseDescriptorSupplier {
    WaterwalkServiceFileDescriptorSupplier() {}
  }

  private static final class WaterwalkServiceMethodDescriptorSupplier
      extends WaterwalkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WaterwalkServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WaterwalkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterwalkServiceFileDescriptorSupplier())
              .addMethod(getGetLocationListMethod())
              .addMethod(getCreateLocationMethod())
              .addMethod(getDeleteLocationMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getGetRouteListMethod())
              .addMethod(getCreateRouteMethod())
              .addMethod(getDeleteRouteMethod())
              .addMethod(getUpdateRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
