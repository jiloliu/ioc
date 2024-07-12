package com.bogon.ioc.service.grpc;

import com.bogon.protobuf.Event;
import com.bogon.protobuf.HelloGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcHelloService extends HelloGrpc.HelloImplBase {

    @Override
    public void sayHello(Event request, StreamObserver<Event> responseObserver) {
        Event reply = Event.newBuilder()
                .setId("server")
                .setMessage("Hello ==> " + request.getId())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
