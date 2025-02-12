package dev.fizlrock.waterwalk.domain.exception.time;

import dev.fizlrock.waterwalk.domain.exception.DomainException;
import java.time.ZoneId;

/** TimeException */
public abstract class TimeException extends DomainException {

  public abstract String getMessage(ZoneId zoneId);
}
