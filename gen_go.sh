#!/bin/sh

#mkdir -p vendor
SRC_DIR=src/main/proto
PROTOC_OPTS='-I $SRC_DIR --go_out=plugins=grpc:vendor'

eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow_serving/apis/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow_serving/config/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow_serving/util/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow_serving/sources/storage_path/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow_serving/core/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow/core/framework/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow/core/example/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow/core/lib/core/*.proto"
eval "protoc $PROTOC_OPTS $SRC_DIR/tensorflow/core/protobuf/*.proto"
