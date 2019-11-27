package tensorflow.serving;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * open source marker; do not remove
 * PredictionService provides access to machine-learned models loaded by
 * model_servers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: tensorflow_serving/apis/prediction_service.proto")
public final class PredictionServiceGrpc {

  private PredictionServiceGrpc() {}

  public static final String SERVICE_NAME = "tensorflow.serving.PredictionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getClassifyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<tensorflow.serving.Classification.ClassificationRequest,
      tensorflow.serving.Classification.ClassificationResponse> METHOD_CLASSIFY = getClassifyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<tensorflow.serving.Classification.ClassificationRequest,
      tensorflow.serving.Classification.ClassificationResponse> getClassifyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<tensorflow.serving.Classification.ClassificationRequest,
      tensorflow.serving.Classification.ClassificationResponse> getClassifyMethod() {
    return getClassifyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<tensorflow.serving.Classification.ClassificationRequest,
      tensorflow.serving.Classification.ClassificationResponse> getClassifyMethodHelper() {
    io.grpc.MethodDescriptor<tensorflow.serving.Classification.ClassificationRequest, tensorflow.serving.Classification.ClassificationResponse> getClassifyMethod;
    if ((getClassifyMethod = PredictionServiceGrpc.getClassifyMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getClassifyMethod = PredictionServiceGrpc.getClassifyMethod) == null) {
          PredictionServiceGrpc.getClassifyMethod = getClassifyMethod = 
              io.grpc.MethodDescriptor.<tensorflow.serving.Classification.ClassificationRequest, tensorflow.serving.Classification.ClassificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.serving.PredictionService", "Classify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.Classification.ClassificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.Classification.ClassificationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Classify"))
                  .build();
          }
        }
     }
     return getClassifyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegressMethod()} instead. 
  public static final io.grpc.MethodDescriptor<tensorflow.serving.RegressionOuterClass.RegressionRequest,
      tensorflow.serving.RegressionOuterClass.RegressionResponse> METHOD_REGRESS = getRegressMethodHelper();

  private static volatile io.grpc.MethodDescriptor<tensorflow.serving.RegressionOuterClass.RegressionRequest,
      tensorflow.serving.RegressionOuterClass.RegressionResponse> getRegressMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<tensorflow.serving.RegressionOuterClass.RegressionRequest,
      tensorflow.serving.RegressionOuterClass.RegressionResponse> getRegressMethod() {
    return getRegressMethodHelper();
  }

  private static io.grpc.MethodDescriptor<tensorflow.serving.RegressionOuterClass.RegressionRequest,
      tensorflow.serving.RegressionOuterClass.RegressionResponse> getRegressMethodHelper() {
    io.grpc.MethodDescriptor<tensorflow.serving.RegressionOuterClass.RegressionRequest, tensorflow.serving.RegressionOuterClass.RegressionResponse> getRegressMethod;
    if ((getRegressMethod = PredictionServiceGrpc.getRegressMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getRegressMethod = PredictionServiceGrpc.getRegressMethod) == null) {
          PredictionServiceGrpc.getRegressMethod = getRegressMethod = 
              io.grpc.MethodDescriptor.<tensorflow.serving.RegressionOuterClass.RegressionRequest, tensorflow.serving.RegressionOuterClass.RegressionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.serving.PredictionService", "Regress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.RegressionOuterClass.RegressionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.RegressionOuterClass.RegressionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Regress"))
                  .build();
          }
        }
     }
     return getRegressMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPredictMethod()} instead. 
  public static final io.grpc.MethodDescriptor<tensorflow.serving.Predict.PredictRequest,
      tensorflow.serving.Predict.PredictResponse> METHOD_PREDICT = getPredictMethodHelper();

  private static volatile io.grpc.MethodDescriptor<tensorflow.serving.Predict.PredictRequest,
      tensorflow.serving.Predict.PredictResponse> getPredictMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<tensorflow.serving.Predict.PredictRequest,
      tensorflow.serving.Predict.PredictResponse> getPredictMethod() {
    return getPredictMethodHelper();
  }

  private static io.grpc.MethodDescriptor<tensorflow.serving.Predict.PredictRequest,
      tensorflow.serving.Predict.PredictResponse> getPredictMethodHelper() {
    io.grpc.MethodDescriptor<tensorflow.serving.Predict.PredictRequest, tensorflow.serving.Predict.PredictResponse> getPredictMethod;
    if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
          PredictionServiceGrpc.getPredictMethod = getPredictMethod = 
              io.grpc.MethodDescriptor.<tensorflow.serving.Predict.PredictRequest, tensorflow.serving.Predict.PredictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.serving.PredictionService", "Predict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.Predict.PredictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.Predict.PredictResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Predict"))
                  .build();
          }
        }
     }
     return getPredictMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMultiInferenceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<tensorflow.serving.Inference.MultiInferenceRequest,
      tensorflow.serving.Inference.MultiInferenceResponse> METHOD_MULTI_INFERENCE = getMultiInferenceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<tensorflow.serving.Inference.MultiInferenceRequest,
      tensorflow.serving.Inference.MultiInferenceResponse> getMultiInferenceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<tensorflow.serving.Inference.MultiInferenceRequest,
      tensorflow.serving.Inference.MultiInferenceResponse> getMultiInferenceMethod() {
    return getMultiInferenceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<tensorflow.serving.Inference.MultiInferenceRequest,
      tensorflow.serving.Inference.MultiInferenceResponse> getMultiInferenceMethodHelper() {
    io.grpc.MethodDescriptor<tensorflow.serving.Inference.MultiInferenceRequest, tensorflow.serving.Inference.MultiInferenceResponse> getMultiInferenceMethod;
    if ((getMultiInferenceMethod = PredictionServiceGrpc.getMultiInferenceMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getMultiInferenceMethod = PredictionServiceGrpc.getMultiInferenceMethod) == null) {
          PredictionServiceGrpc.getMultiInferenceMethod = getMultiInferenceMethod = 
              io.grpc.MethodDescriptor.<tensorflow.serving.Inference.MultiInferenceRequest, tensorflow.serving.Inference.MultiInferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.serving.PredictionService", "MultiInference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.Inference.MultiInferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.Inference.MultiInferenceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("MultiInference"))
                  .build();
          }
        }
     }
     return getMultiInferenceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetModelMetadataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<tensorflow.serving.GetModelMetadata.GetModelMetadataRequest,
      tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> METHOD_GET_MODEL_METADATA = getGetModelMetadataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<tensorflow.serving.GetModelMetadata.GetModelMetadataRequest,
      tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> getGetModelMetadataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<tensorflow.serving.GetModelMetadata.GetModelMetadataRequest,
      tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> getGetModelMetadataMethod() {
    return getGetModelMetadataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<tensorflow.serving.GetModelMetadata.GetModelMetadataRequest,
      tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> getGetModelMetadataMethodHelper() {
    io.grpc.MethodDescriptor<tensorflow.serving.GetModelMetadata.GetModelMetadataRequest, tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> getGetModelMetadataMethod;
    if ((getGetModelMetadataMethod = PredictionServiceGrpc.getGetModelMetadataMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getGetModelMetadataMethod = PredictionServiceGrpc.getGetModelMetadataMethod) == null) {
          PredictionServiceGrpc.getGetModelMetadataMethod = getGetModelMetadataMethod = 
              io.grpc.MethodDescriptor.<tensorflow.serving.GetModelMetadata.GetModelMetadataRequest, tensorflow.serving.GetModelMetadata.GetModelMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tensorflow.serving.PredictionService", "GetModelMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.GetModelMetadata.GetModelMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tensorflow.serving.GetModelMetadata.GetModelMetadataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("GetModelMetadata"))
                  .build();
          }
        }
     }
     return getGetModelMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PredictionServiceStub newStub(io.grpc.Channel channel) {
    return new PredictionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PredictionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PredictionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PredictionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * open source marker; do not remove
   * PredictionService provides access to machine-learned models loaded by
   * model_servers.
   * </pre>
   */
  public static abstract class PredictionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Classify.
     * </pre>
     */
    public void classify(tensorflow.serving.Classification.ClassificationRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.Classification.ClassificationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassifyMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Regress.
     * </pre>
     */
    public void regress(tensorflow.serving.RegressionOuterClass.RegressionRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.RegressionOuterClass.RegressionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegressMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Predict -- provides access to loaded TensorFlow model.
     * </pre>
     */
    public void predict(tensorflow.serving.Predict.PredictRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.Predict.PredictResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPredictMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * MultiInference API for multi-headed models.
     * </pre>
     */
    public void multiInference(tensorflow.serving.Inference.MultiInferenceRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.Inference.MultiInferenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiInferenceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * GetModelMetadata - provides access to metadata for loaded models.
     * </pre>
     */
    public void getModelMetadata(tensorflow.serving.GetModelMetadata.GetModelMetadataRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelMetadataMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClassifyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                tensorflow.serving.Classification.ClassificationRequest,
                tensorflow.serving.Classification.ClassificationResponse>(
                  this, METHODID_CLASSIFY)))
          .addMethod(
            getRegressMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                tensorflow.serving.RegressionOuterClass.RegressionRequest,
                tensorflow.serving.RegressionOuterClass.RegressionResponse>(
                  this, METHODID_REGRESS)))
          .addMethod(
            getPredictMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                tensorflow.serving.Predict.PredictRequest,
                tensorflow.serving.Predict.PredictResponse>(
                  this, METHODID_PREDICT)))
          .addMethod(
            getMultiInferenceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                tensorflow.serving.Inference.MultiInferenceRequest,
                tensorflow.serving.Inference.MultiInferenceResponse>(
                  this, METHODID_MULTI_INFERENCE)))
          .addMethod(
            getGetModelMetadataMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                tensorflow.serving.GetModelMetadata.GetModelMetadataRequest,
                tensorflow.serving.GetModelMetadata.GetModelMetadataResponse>(
                  this, METHODID_GET_MODEL_METADATA)))
          .build();
    }
  }

  /**
   * <pre>
   * open source marker; do not remove
   * PredictionService provides access to machine-learned models loaded by
   * model_servers.
   * </pre>
   */
  public static final class PredictionServiceStub extends io.grpc.stub.AbstractStub<PredictionServiceStub> {
    private PredictionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PredictionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Classify.
     * </pre>
     */
    public void classify(tensorflow.serving.Classification.ClassificationRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.Classification.ClassificationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassifyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Regress.
     * </pre>
     */
    public void regress(tensorflow.serving.RegressionOuterClass.RegressionRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.RegressionOuterClass.RegressionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegressMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Predict -- provides access to loaded TensorFlow model.
     * </pre>
     */
    public void predict(tensorflow.serving.Predict.PredictRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.Predict.PredictResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPredictMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MultiInference API for multi-headed models.
     * </pre>
     */
    public void multiInference(tensorflow.serving.Inference.MultiInferenceRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.Inference.MultiInferenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiInferenceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetModelMetadata - provides access to metadata for loaded models.
     * </pre>
     */
    public void getModelMetadata(tensorflow.serving.GetModelMetadata.GetModelMetadataRequest request,
        io.grpc.stub.StreamObserver<tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelMetadataMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * open source marker; do not remove
   * PredictionService provides access to machine-learned models loaded by
   * model_servers.
   * </pre>
   */
  public static final class PredictionServiceBlockingStub extends io.grpc.stub.AbstractStub<PredictionServiceBlockingStub> {
    private PredictionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PredictionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Classify.
     * </pre>
     */
    public tensorflow.serving.Classification.ClassificationResponse classify(tensorflow.serving.Classification.ClassificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassifyMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Regress.
     * </pre>
     */
    public tensorflow.serving.RegressionOuterClass.RegressionResponse regress(tensorflow.serving.RegressionOuterClass.RegressionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegressMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Predict -- provides access to loaded TensorFlow model.
     * </pre>
     */
    public tensorflow.serving.Predict.PredictResponse predict(tensorflow.serving.Predict.PredictRequest request) {
      return blockingUnaryCall(
          getChannel(), getPredictMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MultiInference API for multi-headed models.
     * </pre>
     */
    public tensorflow.serving.Inference.MultiInferenceResponse multiInference(tensorflow.serving.Inference.MultiInferenceRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiInferenceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetModelMetadata - provides access to metadata for loaded models.
     * </pre>
     */
    public tensorflow.serving.GetModelMetadata.GetModelMetadataResponse getModelMetadata(tensorflow.serving.GetModelMetadata.GetModelMetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelMetadataMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * open source marker; do not remove
   * PredictionService provides access to machine-learned models loaded by
   * model_servers.
   * </pre>
   */
  public static final class PredictionServiceFutureStub extends io.grpc.stub.AbstractStub<PredictionServiceFutureStub> {
    private PredictionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PredictionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PredictionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Classify.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.serving.Classification.ClassificationResponse> classify(
        tensorflow.serving.Classification.ClassificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassifyMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Regress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.serving.RegressionOuterClass.RegressionResponse> regress(
        tensorflow.serving.RegressionOuterClass.RegressionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegressMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Predict -- provides access to loaded TensorFlow model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.serving.Predict.PredictResponse> predict(
        tensorflow.serving.Predict.PredictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPredictMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MultiInference API for multi-headed models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.serving.Inference.MultiInferenceResponse> multiInference(
        tensorflow.serving.Inference.MultiInferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiInferenceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetModelMetadata - provides access to metadata for loaded models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tensorflow.serving.GetModelMetadata.GetModelMetadataResponse> getModelMetadata(
        tensorflow.serving.GetModelMetadata.GetModelMetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelMetadataMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLASSIFY = 0;
  private static final int METHODID_REGRESS = 1;
  private static final int METHODID_PREDICT = 2;
  private static final int METHODID_MULTI_INFERENCE = 3;
  private static final int METHODID_GET_MODEL_METADATA = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PredictionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PredictionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLASSIFY:
          serviceImpl.classify((tensorflow.serving.Classification.ClassificationRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.serving.Classification.ClassificationResponse>) responseObserver);
          break;
        case METHODID_REGRESS:
          serviceImpl.regress((tensorflow.serving.RegressionOuterClass.RegressionRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.serving.RegressionOuterClass.RegressionResponse>) responseObserver);
          break;
        case METHODID_PREDICT:
          serviceImpl.predict((tensorflow.serving.Predict.PredictRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.serving.Predict.PredictResponse>) responseObserver);
          break;
        case METHODID_MULTI_INFERENCE:
          serviceImpl.multiInference((tensorflow.serving.Inference.MultiInferenceRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.serving.Inference.MultiInferenceResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_METADATA:
          serviceImpl.getModelMetadata((tensorflow.serving.GetModelMetadata.GetModelMetadataRequest) request,
              (io.grpc.stub.StreamObserver<tensorflow.serving.GetModelMetadata.GetModelMetadataResponse>) responseObserver);
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

  private static abstract class PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tensorflow.serving.PredictionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictionService");
    }
  }

  private static final class PredictionServiceFileDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier {
    PredictionServiceFileDescriptorSupplier() {}
  }

  private static final class PredictionServiceMethodDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PredictionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PredictionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PredictionServiceFileDescriptorSupplier())
              .addMethod(getClassifyMethodHelper())
              .addMethod(getRegressMethodHelper())
              .addMethod(getPredictMethodHelper())
              .addMethod(getMultiInferenceMethodHelper())
              .addMethod(getGetModelMetadataMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
