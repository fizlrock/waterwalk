



# Envoy proxy test



```zsh
curl -v -X POST \
  -H "Content-Type: application/grpc-web+proto" \
  -H "Accept: application/grpc-web+proto" \
  http://localhost:8080/dev.fizlrock.waterwalk.grpc.WaterwalkService/createLocation

  <!-- -d '{"name": "First"}' \ -->

  
curl -v -X POST \
  -H "Content-Type: application/grpc-web+proto" \
  -H "Accept: application/grpc-web+proto" \
  -d '{"name": "First"}' \
  http://localhost:8080/dev.fizlrock.waterwalk.grpc.WaterwalkService/createLocation


curl -v -X POST http://localhost:8080/dev.fizlrock.waterwalk.grpc.WaterwalkService/createLocation\
-H 'Pragma: no-cache'\
-H 'X-User-Agent: grpc-web-javascript/0.1'\
-H 'Origin: http://localhost:8081'\
-H 'Accept-Encoding: gzip, deflate, br'\
-H 'Accept-Language: en-US,en;q=0.9'\
-H 'Content-Type: application/grpc-web+proto'\
-H 'Accept: */*'\
-H 'X-Grpc-Web: 1'\
-H 'Cache-Control: no-cache'\
-H 'Referer: http://localhost:8081/echotest.html'\
-H 'Connection: keep-alive' --data-binary $'\x00\x00\x00\x00\x05\n\x03abc' --compressed


grpcurl -plaintext -d '{"name": "Thrid"}' localhost:9090 dev.fizlrock.waterwalk.grpc.WaterwalkService.createLocation


  

```


# MongoDB

```json
{
  "find": "location",
  "filter": {
    "_id": {
      "$binary": {
        "base64": "wU4bFrnLL12zdE+D34yOrg==",
        "subType": "03"
      }
    }
  },
  "limit": 1,
  "singleBatch": true,
  "$db": "test",
  "lsid": {
    "id": {
      "$binary": {
        "base64": "dv8igHwIRKyz00dbru+nfQ==",
        "subType": "04"
      }
    }
  }
}```


# GRPC

```zsh
grpcurl -plaintext localhost:9090 list

grpcurl -plaintext localhost:9090 describe dev.fizlrock.waterwalk.grpc.WaterwalkService

grpcurl -plaintext -d '{}' localhost:9090 dev.fizlrock.waterwalk.grpc.WaterwalkService.getLocationList

grpcurl -plaintext -d '{"name": "Thrid"}' localhost:9090 dev.fizlrock.waterwalk.grpc.WaterwalkService.createLocation




grpcurl -plaintext -d \
'{"id": "5d2fcbb9-161b-4ec1-ae8e-8cdf834f74b3",  "name": "First Lo",  "description": "esse"}'\
 localhost:9090 dev.fizlrock.waterwalk.grpc.WaterwalkService.updateLocation

```

```proto
service WaterwalkService {
  rpc createLocation ( .dev.fizlrock.waterwalk.grpc.CreateLocationRq ) returns ( .dev.fizlrock.waterwalk.grpc.Void );
  rpc createRoute ( .dev.fizlrock.waterwalk.grpc.CreateRouteRq ) returns ( .dev.fizlrock.waterwalk.grpc.Void );
  rpc deleteLocation ( .dev.fizlrock.waterwalk.grpc.Id ) returns ( .dev.fizlrock.waterwalk.grpc.Void );
  rpc deleteRoute ( .dev.fizlrock.waterwalk.grpc.Id ) returns ( .dev.fizlrock.waterwalk.grpc.Void );
  rpc getLocationList ( .dev.fizlrock.waterwalk.grpc.Void ) returns ( stream .dev.fizlrock.waterwalk.grpc.LocationDto );
  rpc getRouteList ( .dev.fizlrock.waterwalk.grpc.Void ) returns ( stream .dev.fizlrock.waterwalk.grpc.RouteDto );
  rpc updateLocation ( .dev.fizlrock.waterwalk.grpc.LocationDto ) returns ( .dev.fizlrock.waterwalk.grpc.Void );
  rpc updateRoute ( .dev.fizlrock.waterwalk.grpc.RouteDto ) returns ( .dev.fizlrock.waterwalk.grpc.Void );
}
```

dev.fizlrock.waterwalk.grpc.WaterwalkService
grpc.health.v1.Health
grpc.reflection.v1alpha.ServerReflection



