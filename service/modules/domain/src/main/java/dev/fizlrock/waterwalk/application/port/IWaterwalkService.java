package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.application.port.dto.CreateLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.DeleteLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.GetLocationListRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.application.port.dto.LocationListRsp;
import dev.fizlrock.waterwalk.application.port.dto.UpdateLocationRq;

/** ILocationService */
public interface IWaterwalkService {

  LocationListRsp getLocationList(GetLocationListRq rq);

  LocationDto updateLocaton(UpdateLocationRq rq);

  LocationDto deleteLocaton(DeleteLocationRq rq);

  LocationDto createLocaton(CreateLocationRq rq);
}
