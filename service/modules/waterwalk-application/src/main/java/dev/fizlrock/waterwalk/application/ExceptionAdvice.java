package dev.fizlrock.waterwalk.application;

import dev.fizlrock.waterwalk.domain.exception.DomainException;
import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
@Slf4j
public class ExceptionAdvice {

  @GrpcExceptionHandler
  public Status handleDomainException(DomainException e) {
    return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
  }

  @GrpcExceptionHandler
  public Status handleValidateException(IllegalArgumentException e) {
    return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
  }

  @GrpcExceptionHandler
  public Status handleException(Exception e) {
    log.error("Error...", e);
    return Status.INVALID_ARGUMENT.withDescription("Упс... всё сломалось");
  }
}
