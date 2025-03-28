/**
 * @fileoverview gRPC-Web generated client stub for dev.fizlrock.waterwalk.grpc
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.5.0
// 	protoc              v6.30.1
// source: contract.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js')
const proto = {};
proto.dev = {};
proto.dev.fizlrock = {};
proto.dev.fizlrock.waterwalk = {};
proto.dev.fizlrock.waterwalk.grpc = require('./contract_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options.format = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname.replace(/\/+$/, '');

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options.format = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname.replace(/\/+$/, '');

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.Void,
 *   !proto.dev.fizlrock.waterwalk.grpc.LocationDto>}
 */
const methodDescriptor_WaterwalkService_getLocationList = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/getLocationList',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.dev.fizlrock.waterwalk.grpc.Void,
  proto.dev.fizlrock.waterwalk.grpc.LocationDto,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.Void} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.LocationDto.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.Void} request The request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.LocationDto>}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.getLocationList =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/getLocationList',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_getLocationList);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.Void} request The request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.LocationDto>}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.getLocationList =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/getLocationList',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_getLocationList);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.CreateLocationRq,
 *   !proto.dev.fizlrock.waterwalk.grpc.LocationDto>}
 */
const methodDescriptor_WaterwalkService_createLocation = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/createLocation',
  grpc.web.MethodType.UNARY,
  proto.dev.fizlrock.waterwalk.grpc.CreateLocationRq,
  proto.dev.fizlrock.waterwalk.grpc.LocationDto,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.CreateLocationRq} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.LocationDto.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.CreateLocationRq} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.dev.fizlrock.waterwalk.grpc.LocationDto)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.LocationDto>|undefined}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.createLocation =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/createLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_createLocation,
      callback);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.CreateLocationRq} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.dev.fizlrock.waterwalk.grpc.LocationDto>}
 *     Promise that resolves to the response
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.createLocation =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/createLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_createLocation);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.LocationId,
 *   !proto.dev.fizlrock.waterwalk.grpc.Void>}
 */
const methodDescriptor_WaterwalkService_deleteLocation = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/deleteLocation',
  grpc.web.MethodType.UNARY,
  proto.dev.fizlrock.waterwalk.grpc.LocationId,
  proto.dev.fizlrock.waterwalk.grpc.Void,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationId} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.Void.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationId} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.dev.fizlrock.waterwalk.grpc.Void)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.Void>|undefined}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.deleteLocation =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/deleteLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_deleteLocation,
      callback);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationId} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.dev.fizlrock.waterwalk.grpc.Void>}
 *     Promise that resolves to the response
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.deleteLocation =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/deleteLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_deleteLocation);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.LocationDto,
 *   !proto.dev.fizlrock.waterwalk.grpc.Void>}
 */
const methodDescriptor_WaterwalkService_updateLocation = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/updateLocation',
  grpc.web.MethodType.UNARY,
  proto.dev.fizlrock.waterwalk.grpc.LocationDto,
  proto.dev.fizlrock.waterwalk.grpc.Void,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationDto} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.Void.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationDto} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.dev.fizlrock.waterwalk.grpc.Void)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.Void>|undefined}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.updateLocation =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/updateLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_updateLocation,
      callback);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationDto} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.dev.fizlrock.waterwalk.grpc.Void>}
 *     Promise that resolves to the response
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.updateLocation =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/updateLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_updateLocation);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.LocationId,
 *   !proto.dev.fizlrock.waterwalk.grpc.RouteDto>}
 */
const methodDescriptor_WaterwalkService_getRoutesInLocation = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/getRoutesInLocation',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.dev.fizlrock.waterwalk.grpc.LocationId,
  proto.dev.fizlrock.waterwalk.grpc.RouteDto,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationId} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.RouteDto.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationId} request The request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.RouteDto>}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.getRoutesInLocation =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/getRoutesInLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_getRoutesInLocation);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.LocationId} request The request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.RouteDto>}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.getRoutesInLocation =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/getRoutesInLocation',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_getRoutesInLocation);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.CreateRouteRq,
 *   !proto.dev.fizlrock.waterwalk.grpc.RouteDto>}
 */
const methodDescriptor_WaterwalkService_createRoute = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/createRoute',
  grpc.web.MethodType.UNARY,
  proto.dev.fizlrock.waterwalk.grpc.CreateRouteRq,
  proto.dev.fizlrock.waterwalk.grpc.RouteDto,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.CreateRouteRq} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.RouteDto.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.CreateRouteRq} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.dev.fizlrock.waterwalk.grpc.RouteDto)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.RouteDto>|undefined}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.createRoute =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/createRoute',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_createRoute,
      callback);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.CreateRouteRq} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.dev.fizlrock.waterwalk.grpc.RouteDto>}
 *     Promise that resolves to the response
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.createRoute =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/createRoute',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_createRoute);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.RouteId,
 *   !proto.dev.fizlrock.waterwalk.grpc.Void>}
 */
const methodDescriptor_WaterwalkService_deleteRoute = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/deleteRoute',
  grpc.web.MethodType.UNARY,
  proto.dev.fizlrock.waterwalk.grpc.RouteId,
  proto.dev.fizlrock.waterwalk.grpc.Void,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.RouteId} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.Void.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.RouteId} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.dev.fizlrock.waterwalk.grpc.Void)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.Void>|undefined}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.deleteRoute =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/deleteRoute',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_deleteRoute,
      callback);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.RouteId} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.dev.fizlrock.waterwalk.grpc.Void>}
 *     Promise that resolves to the response
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.deleteRoute =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/deleteRoute',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_deleteRoute);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.dev.fizlrock.waterwalk.grpc.RouteDto,
 *   !proto.dev.fizlrock.waterwalk.grpc.Void>}
 */
const methodDescriptor_WaterwalkService_updateRoute = new grpc.web.MethodDescriptor(
  '/dev.fizlrock.waterwalk.grpc.WaterwalkService/updateRoute',
  grpc.web.MethodType.UNARY,
  proto.dev.fizlrock.waterwalk.grpc.RouteDto,
  proto.dev.fizlrock.waterwalk.grpc.Void,
  /**
   * @param {!proto.dev.fizlrock.waterwalk.grpc.RouteDto} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.dev.fizlrock.waterwalk.grpc.Void.deserializeBinary
);


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.RouteDto} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.dev.fizlrock.waterwalk.grpc.Void)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.dev.fizlrock.waterwalk.grpc.Void>|undefined}
 *     The XHR Node Readable Stream
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServiceClient.prototype.updateRoute =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/updateRoute',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_updateRoute,
      callback);
};


/**
 * @param {!proto.dev.fizlrock.waterwalk.grpc.RouteDto} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.dev.fizlrock.waterwalk.grpc.Void>}
 *     Promise that resolves to the response
 */
proto.dev.fizlrock.waterwalk.grpc.WaterwalkServicePromiseClient.prototype.updateRoute =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/dev.fizlrock.waterwalk.grpc.WaterwalkService/updateRoute',
      request,
      metadata || {},
      methodDescriptor_WaterwalkService_updateRoute);
};


module.exports = proto.dev.fizlrock.waterwalk.grpc;

