package dev.fizlrock.waterwalk.grpc.impl;

import dev.fizlrock.waterwalk.domain.exception.DomainException;
import io.grpc.Status;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcAdvice
public class GrpcExceptionAdvice {

  private static final Logger logger = LoggerFactory.getLogger(GrpcExceptionAdvice.class);

  @GrpcExceptionHandler(DomainException.class)
  public Status domainException(DomainException e) {
    return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
  }

  @GrpcExceptionHandler
  public Status handleInvalidArgument(Exception e) {
    logger.error("ОшибОчка", e);
    // TODO здесь надо маппинг сделать
    return Status.INTERNAL
        .withDescription("Внутренняя ошибка. Разработчик оповещён, скоро починим")
        .withCause(e);
  }
}
