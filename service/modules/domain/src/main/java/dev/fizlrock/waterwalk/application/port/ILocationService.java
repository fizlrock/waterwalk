package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.application.port.dto.GetLocationListRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.application.port.dto.UpdateLocationRq;

/** ILocationService */
public interface ILocationService {

  LocationDto getLocationList(GetLocationListRq rq);

  LocationDto updateLocaton(UpdateLocationRq rq);
}
