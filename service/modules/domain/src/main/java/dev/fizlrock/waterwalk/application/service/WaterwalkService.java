package dev.fizlrock.waterwalk.application.service;

import dev.fizlrock.waterwalk.application.mapper.LocationMapper;
import dev.fizlrock.waterwalk.application.mapper.RouteMapper;
import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.application.port.IWaterwalkService;
import dev.fizlrock.waterwalk.application.port.dto.LocationCreateRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDeleteRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.application.port.dto.LocationListGetRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationListRsp;
import dev.fizlrock.waterwalk.application.port.dto.LocationUpdateRq;
import dev.fizlrock.waterwalk.application.port.dto.RouteCreateRq;
import dev.fizlrock.waterwalk.application.port.dto.RouteDto;
import dev.fizlrock.waterwalk.application.port.dto.RouteUpdateRq;
import dev.fizlrock.waterwalk.domain.exception.LocationNameDublicateException;
import dev.fizlrock.waterwalk.domain.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaterwalkService implements IWaterwalkService {

  @Autowired ILocationRepository locationRepository;
  @Autowired LocationService locationService;
  @Autowired LocationMapper locationMapper;
  @Autowired RouteMapper routeMapper;

  @Override
  public LocationListRsp getLocationList(LocationListGetRq rq) {
    var locations = locationRepository.findAll((int) rq.getSkip(), (int) rq.getLimit());

    var dtos = locations.stream().map(locationMapper::toDto).toList();

    return new LocationListRsp(dtos);
  }

  @Override
  public LocationDto updateLocaton(LocationUpdateRq rq) {

    var location = locationService.getLocation(rq.getOldName());

    location.setLocationName(rq.getLocation().getLocationName());
    location.setComment(rq.getLocation().getComment());

    locationRepository.updateByName(rq.getOldName(), location);
    return new LocationDto(location.getLocationName(), location.getLocationName());
  }

  @Override
  public LocationDto deleteLocaton(LocationDeleteRq rq) {

    var location = locationService.getLocation(rq.getLocationName());

    locationRepository.removeByName(rq.getLocationName());

    return locationMapper.toDto(location);
  }

  @Override
  public LocationDto createLocaton(LocationCreateRq rq) {

    LocationDto dto = rq.getLocation();
    var loc_name = rq.getLocation().getLocationName();

    if (locationRepository.findByName(loc_name).isPresent())
      throw new LocationNameDublicateException(loc_name);

    var location = locationMapper.toDomain(dto);

    locationRepository.save(location);

    return dto;
  }

  @Override
  public RouteDto addRoute(RouteCreateRq rq) {
    var location = locationService.getLocation(rq.locationName());

    var route = routeMapper.toDomain(rq.route());

    location.addRoute(route);

    locationRepository.save(location);

    throw new UnsupportedOperationException("Unimplemented method 'addRoute'");
  }

  @Override
  public RouteDto updateRoute(RouteUpdateRq rq) {
    var location = locationService.getLocation(rq.locationName());

    var route = location.getRouteByName(rq.oldRouteName());

    location.renameRoute(rq.oldRouteName(), rq.route().name());

    route.setComment(rq.route().comment());
    route.setDistance(rq.route().distance());
    route.setComment(rq.route().comment());
    route.setComment(rq.route().comment());

    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateRoute'");
  }
}
