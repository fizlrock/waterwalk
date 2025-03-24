package dev.fizlrock.waterwalk.application.port;

import dev.fizlrock.waterwalk.application.port.dto.LocationCreateRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDeleteRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.application.port.dto.LocationListGetRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationListRsp;
import dev.fizlrock.waterwalk.application.port.dto.LocationUpdateRq;
import dev.fizlrock.waterwalk.application.port.dto.RouteCreateRq;
import dev.fizlrock.waterwalk.application.port.dto.RouteDto;
import dev.fizlrock.waterwalk.application.port.dto.RouteUpdateRq;

/** ILocationService */
public interface IWaterwalkService {

  LocationListRsp getLocationList(LocationListGetRq rq);

  LocationDto updateLocaton(LocationUpdateRq rq);

  LocationDto deleteLocaton(LocationDeleteRq rq);

  LocationDto createLocaton(LocationCreateRq rq);

  RouteDto addRoute(RouteCreateRq rq);

  RouteDto updateRoute(RouteUpdateRq rq);
}
