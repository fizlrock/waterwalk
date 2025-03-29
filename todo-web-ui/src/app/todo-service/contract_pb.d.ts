import * as jspb from 'google-protobuf'

import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"


export class LocationTree extends jspb.Message {
  getLocation(): LocationDto | undefined;
  setLocation(value?: LocationDto): LocationTree;
  hasLocation(): boolean;
  clearLocation(): LocationTree;

  getRoutesList(): Array<RouteDto>;
  setRoutesList(value: Array<RouteDto>): LocationTree;
  clearRoutesList(): LocationTree;
  addRoutes(value?: RouteDto, index?: number): RouteDto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LocationTree.AsObject;
  static toObject(includeInstance: boolean, msg: LocationTree): LocationTree.AsObject;
  static serializeBinaryToWriter(message: LocationTree, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LocationTree;
  static deserializeBinaryFromReader(message: LocationTree, reader: jspb.BinaryReader): LocationTree;
}

export namespace LocationTree {
  export type AsObject = {
    location?: LocationDto.AsObject,
    routesList: Array<RouteDto.AsObject>,
  }
}

export class LocationId extends jspb.Message {
  getId(): string;
  setId(value: string): LocationId;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LocationId.AsObject;
  static toObject(includeInstance: boolean, msg: LocationId): LocationId.AsObject;
  static serializeBinaryToWriter(message: LocationId, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LocationId;
  static deserializeBinaryFromReader(message: LocationId, reader: jspb.BinaryReader): LocationId;
}

export namespace LocationId {
  export type AsObject = {
    id: string,
  }
}

export class RouteId extends jspb.Message {
  getId(): string;
  setId(value: string): RouteId;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RouteId.AsObject;
  static toObject(includeInstance: boolean, msg: RouteId): RouteId.AsObject;
  static serializeBinaryToWriter(message: RouteId, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RouteId;
  static deserializeBinaryFromReader(message: RouteId, reader: jspb.BinaryReader): RouteId;
}

export namespace RouteId {
  export type AsObject = {
    id: string,
  }
}

export class Void extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Void.AsObject;
  static toObject(includeInstance: boolean, msg: Void): Void.AsObject;
  static serializeBinaryToWriter(message: Void, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Void;
  static deserializeBinaryFromReader(message: Void, reader: jspb.BinaryReader): Void;
}

export namespace Void {
  export type AsObject = {
  }
}

export class CreateLocationRq extends jspb.Message {
  getName(): string;
  setName(value: string): CreateLocationRq;

  getDescription(): string;
  setDescription(value: string): CreateLocationRq;
  hasDescription(): boolean;
  clearDescription(): CreateLocationRq;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateLocationRq.AsObject;
  static toObject(includeInstance: boolean, msg: CreateLocationRq): CreateLocationRq.AsObject;
  static serializeBinaryToWriter(message: CreateLocationRq, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateLocationRq;
  static deserializeBinaryFromReader(message: CreateLocationRq, reader: jspb.BinaryReader): CreateLocationRq;
}

export namespace CreateLocationRq {
  export type AsObject = {
    name: string,
    description?: string,
  }

  export enum DescriptionCase { 
    _DESCRIPTION_NOT_SET = 0,
    DESCRIPTION = 2,
  }
}

export class LocationDto extends jspb.Message {
  getId(): string;
  setId(value: string): LocationDto;

  getName(): string;
  setName(value: string): LocationDto;

  getDescription(): string;
  setDescription(value: string): LocationDto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LocationDto.AsObject;
  static toObject(includeInstance: boolean, msg: LocationDto): LocationDto.AsObject;
  static serializeBinaryToWriter(message: LocationDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LocationDto;
  static deserializeBinaryFromReader(message: LocationDto, reader: jspb.BinaryReader): LocationDto;
}

export namespace LocationDto {
  export type AsObject = {
    id: string,
    name: string,
    description: string,
  }
}

export class CreateRouteRq extends jspb.Message {
  getLocationid(): string;
  setLocationid(value: string): CreateRouteRq;

  getName(): string;
  setName(value: string): CreateRouteRq;

  getComment(): string;
  setComment(value: string): CreateRouteRq;

  getDistance(): number;
  setDistance(value: number): CreateRouteRq;

  getDifficulty(): RouteDifficulty;
  setDifficulty(value: RouteDifficulty): CreateRouteRq;

  getDuration(): number;
  setDuration(value: number): CreateRouteRq;

  getPrice(): number;
  setPrice(value: number): CreateRouteRq;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateRouteRq.AsObject;
  static toObject(includeInstance: boolean, msg: CreateRouteRq): CreateRouteRq.AsObject;
  static serializeBinaryToWriter(message: CreateRouteRq, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateRouteRq;
  static deserializeBinaryFromReader(message: CreateRouteRq, reader: jspb.BinaryReader): CreateRouteRq;
}

export namespace CreateRouteRq {
  export type AsObject = {
    locationid: string,
    name: string,
    comment: string,
    distance: number,
    difficulty: RouteDifficulty,
    duration: number,
    price: number,
  }
}

export class RouteDto extends jspb.Message {
  getId(): string;
  setId(value: string): RouteDto;

  getLocationid(): string;
  setLocationid(value: string): RouteDto;

  getName(): string;
  setName(value: string): RouteDto;

  getComment(): string;
  setComment(value: string): RouteDto;

  getDistance(): number;
  setDistance(value: number): RouteDto;

  getDifficulty(): RouteDifficulty;
  setDifficulty(value: RouteDifficulty): RouteDto;

  getDuration(): number;
  setDuration(value: number): RouteDto;

  getPrice(): number;
  setPrice(value: number): RouteDto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RouteDto.AsObject;
  static toObject(includeInstance: boolean, msg: RouteDto): RouteDto.AsObject;
  static serializeBinaryToWriter(message: RouteDto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RouteDto;
  static deserializeBinaryFromReader(message: RouteDto, reader: jspb.BinaryReader): RouteDto;
}

export namespace RouteDto {
  export type AsObject = {
    id: string,
    locationid: string,
    name: string,
    comment: string,
    distance: number,
    difficulty: RouteDifficulty,
    duration: number,
    price: number,
  }
}

export enum RouteDifficulty { 
  EASY = 0,
  MEDIUM = 1,
  HARD = 2,
}
