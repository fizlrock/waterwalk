
�	
contract.protodev.fizlrock.waterwalk.grpcgoogle/protobuf/timestamp.proto"p
UpdateLocationRq
old_name (	RoldNameA
location (2%.dev.fizlrock.waterwalk.grpc.LocationRlocation"7
DeleteLocationRq#
location_name (	RlocationName"Q
DeleteRouteRq!
locaton_name (	RlocatonName

route_name (	R	routeName"
Void"5
	SkipLimit
skip (Rskip
limit (Rlimit"@
Location
name (	Rname 
description (	Rdescription"�
Route
name (	Rname
comment (	Rcomment
distance (RdistanceL

difficulty (2,.dev.fizlrock.waterwalk.grpc.RouteDifficultyR
difficulty
duration (Rduration
price (Rprice*1
RouteDifficulty
EASY 

MEDIUM
HARD2�
WaterwalkServiceb
getLocationList&.dev.fizlrock.waterwalk.grpc.SkipLimit%.dev.fizlrock.waterwalk.grpc.Location0Z
createLocation%.dev.fizlrock.waterwalk.grpc.Location!.dev.fizlrock.waterwalk.grpc.Voidb
deleteLocation-.dev.fizlrock.waterwalk.grpc.DeleteLocationRq!.dev.fizlrock.waterwalk.grpc.Voidb
updateLocation-.dev.fizlrock.waterwalk.grpc.UpdateLocationRq!.dev.fizlrock.waterwalk.grpc.VoidB#
dev.fizlrock.waterwalk.grpc.apiPbproto3