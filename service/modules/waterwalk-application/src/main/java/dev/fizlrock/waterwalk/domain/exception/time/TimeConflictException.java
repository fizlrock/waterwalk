package dev.fizlrock.waterwalk.domain.exception.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/** TimeConflictException */
@RequiredArgsConstructor
@Getter
public class TimeConflictException extends TimeException {
  private final Instant existingPlan, conflictPlan;

  DateTimeFormatter HMformatter = DateTimeFormatter.ofPattern("HH:mm");

  @Override
  public String getMessage() {
    return getMessage(ZoneId.of("Europe/Samara"));
  }

  @Override
  public String getMessage(ZoneId zoneId) {
    String con_time = conflictPlan.atZone(zoneId).format(HMformatter);
    String exst_time = existingPlan.atZone(zoneId).format(HMformatter);
    return "Нельзя назначить прогулку на %s, он пересекается с прогулкой на %s"
        .formatted(con_time, exst_time);
  }
}
