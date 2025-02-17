// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contract.proto

package dev.fizlrock.waterwalk.grpc.api;

public final class Contract {
  private Contract() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_UpdateLocationRq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_UpdateLocationRq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_DeleteLocationRq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_DeleteLocationRq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_DeleteRouteRq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_DeleteRouteRq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_Void_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_SkipLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_SkipLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_fizlrock_waterwalk_grpc_Route_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_fizlrock_waterwalk_grpc_Route_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016contract.proto\022\033dev.fizlrock.waterwalk" +
      ".grpc\032\037google/protobuf/timestamp.proto\"]" +
      "\n\020UpdateLocationRq\022\020\n\010old_name\030\001 \001(\t\0227\n\010" +
      "location\030\002 \001(\0132%.dev.fizlrock.waterwalk." +
      "grpc.Location\")\n\020DeleteLocationRq\022\025\n\rloc" +
      "ation_name\030\001 \001(\t\"9\n\rDeleteRouteRq\022\024\n\014loc" +
      "aton_name\030\001 \001(\t\022\022\n\nroute_name\030\002 \001(\t\"\006\n\004V" +
      "oid\"(\n\tSkipLimit\022\014\n\004skip\030\001 \001(\003\022\r\n\005limit\030" +
      "\002 \001(\003\"-\n\010Location\022\014\n\004name\030\002 \001(\t\022\023\n\013descr" +
      "iption\030\003 \001(\t\"\233\001\n\005Route\022\014\n\004name\030\001 \001(\t\022\017\n\007" +
      "comment\030\002 \001(\t\022\020\n\010distance\030\003 \001(\003\022@\n\ndiffi" +
      "culty\030\004 \001(\0162,.dev.fizlrock.waterwalk.grp" +
      "c.RouteDifficulty\022\020\n\010duration\030\005 \001(\003\022\r\n\005p" +
      "rice\030\006 \001(\003*1\n\017RouteDifficulty\022\010\n\004EASY\020\000\022" +
      "\n\n\006MEDIUM\020\001\022\010\n\004HARD\020\0022\232\003\n\020WaterwalkServi" +
      "ce\022b\n\017getLocationList\022&.dev.fizlrock.wat" +
      "erwalk.grpc.SkipLimit\032%.dev.fizlrock.wat" +
      "erwalk.grpc.Location0\001\022Z\n\016createLocation" +
      "\022%.dev.fizlrock.waterwalk.grpc.Location\032" +
      "!.dev.fizlrock.waterwalk.grpc.Void\022b\n\016de" +
      "leteLocation\022-.dev.fizlrock.waterwalk.gr" +
      "pc.DeleteLocationRq\032!.dev.fizlrock.water" +
      "walk.grpc.Void\022b\n\016updateLocation\022-.dev.f" +
      "izlrock.waterwalk.grpc.UpdateLocationRq\032" +
      "!.dev.fizlrock.waterwalk.grpc.VoidB#\n\037de" +
      "v.fizlrock.waterwalk.grpc.apiP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_dev_fizlrock_waterwalk_grpc_UpdateLocationRq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dev_fizlrock_waterwalk_grpc_UpdateLocationRq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_UpdateLocationRq_descriptor,
        new java.lang.String[] { "OldName", "Location", });
    internal_static_dev_fizlrock_waterwalk_grpc_DeleteLocationRq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dev_fizlrock_waterwalk_grpc_DeleteLocationRq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_DeleteLocationRq_descriptor,
        new java.lang.String[] { "LocationName", });
    internal_static_dev_fizlrock_waterwalk_grpc_DeleteRouteRq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dev_fizlrock_waterwalk_grpc_DeleteRouteRq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_DeleteRouteRq_descriptor,
        new java.lang.String[] { "LocatonName", "RouteName", });
    internal_static_dev_fizlrock_waterwalk_grpc_Void_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dev_fizlrock_waterwalk_grpc_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_Void_descriptor,
        new java.lang.String[] { });
    internal_static_dev_fizlrock_waterwalk_grpc_SkipLimit_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dev_fizlrock_waterwalk_grpc_SkipLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_SkipLimit_descriptor,
        new java.lang.String[] { "Skip", "Limit", });
    internal_static_dev_fizlrock_waterwalk_grpc_Location_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dev_fizlrock_waterwalk_grpc_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_Location_descriptor,
        new java.lang.String[] { "Name", "Description", });
    internal_static_dev_fizlrock_waterwalk_grpc_Route_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dev_fizlrock_waterwalk_grpc_Route_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_fizlrock_waterwalk_grpc_Route_descriptor,
        new java.lang.String[] { "Name", "Comment", "Distance", "Difficulty", "Duration", "Price", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
