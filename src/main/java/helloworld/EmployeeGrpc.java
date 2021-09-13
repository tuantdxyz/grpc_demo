package helloworld;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: employee.proto")
public final class EmployeeGrpc {

  private EmployeeGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Employee";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<helloworld.EmployeeReq,
      helloworld.EmployeeRes> getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_employee",
      requestType = helloworld.EmployeeReq.class,
      responseType = helloworld.EmployeeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<helloworld.EmployeeReq,
      helloworld.EmployeeRes> getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<helloworld.EmployeeReq, helloworld.EmployeeRes> getGetEmployeeMethod;
    if ((getGetEmployeeMethod = EmployeeGrpc.getGetEmployeeMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getGetEmployeeMethod = EmployeeGrpc.getGetEmployeeMethod) == null) {
          EmployeeGrpc.getGetEmployeeMethod = getGetEmployeeMethod = 
              io.grpc.MethodDescriptor.<helloworld.EmployeeReq, helloworld.EmployeeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Employee", "get_employee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.EmployeeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.EmployeeRes.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("get_employee"))
                  .build();
          }
        }
     }
     return getGetEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeStub newStub(io.grpc.Channel channel) {
    return new EmployeeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployee(helloworld.EmployeeReq request,
        io.grpc.stub.StreamObserver<helloworld.EmployeeRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                helloworld.EmployeeReq,
                helloworld.EmployeeRes>(
                  this, METHODID_GET_EMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeStub extends io.grpc.stub.AbstractStub<EmployeeStub> {
    private EmployeeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeStub(channel, callOptions);
    }

    /**
     */
    public void getEmployee(helloworld.EmployeeReq request,
        io.grpc.stub.StreamObserver<helloworld.EmployeeRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeBlockingStub extends io.grpc.stub.AbstractStub<EmployeeBlockingStub> {
    private EmployeeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeBlockingStub(channel, callOptions);
    }

    /**
     */
    public helloworld.EmployeeRes getEmployee(helloworld.EmployeeReq request) {
      return blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeFutureStub extends io.grpc.stub.AbstractStub<EmployeeFutureStub> {
    private EmployeeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<helloworld.EmployeeRes> getEmployee(
        helloworld.EmployeeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee((helloworld.EmployeeReq) request,
              (io.grpc.stub.StreamObserver<helloworld.EmployeeRes>) responseObserver);
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

  private static abstract class EmployeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return helloworld.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Employee");
    }
  }

  private static final class EmployeeFileDescriptorSupplier
      extends EmployeeBaseDescriptorSupplier {
    EmployeeFileDescriptorSupplier() {}
  }

  private static final class EmployeeMethodDescriptorSupplier
      extends EmployeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeFileDescriptorSupplier())
              .addMethod(getGetEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
