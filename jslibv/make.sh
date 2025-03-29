protoc --proto_path=/home/fizlrock/code2025/java/waterwalk-modules/service/modules/grpc-api/src/main/proto \
contract.proto \
--js_out=import_style=commonjs,binary:. \
--grpc-web_out=import_style=commonjs,mode=grpcwebtext:. \

