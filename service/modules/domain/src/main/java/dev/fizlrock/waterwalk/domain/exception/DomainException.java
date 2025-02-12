package dev.fizlrock.waterwalk.domain.exception;

/** DomainException */
public abstract class DomainException extends RuntimeException {
  public DomainException() {}

  public DomainException(String msg) {
    super(msg);
  }
}
