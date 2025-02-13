package dev.fizlrock.waterwalk.application.service;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.application.port.IWaterwalkService;
import dev.fizlrock.waterwalk.application.port.dto.CreateLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.DeleteLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.GetLocationListRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.application.port.dto.LocationListRsp;
import dev.fizlrock.waterwalk.application.port.dto.UpdateLocationRq;
import dev.fizlrock.waterwalk.domain.entity.Location;
import dev.fizlrock.waterwalk.domain.exception.LocationNameDublicateException;
import dev.fizlrock.waterwalk.domain.exception.LocationNameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaterwalkService implements IWaterwalkService {

  @Autowired ILocationRepository locationRepository;

  @Override
  public LocationListRsp getLocationList(GetLocationListRq rq) {
    var locations = locationRepository.findAll((int) rq.getSkip(), (int) rq.getLimit());

    var dtos =
        locations.stream().map(l -> new LocationDto(l.getLocationName(), l.getComment())).toList();

    return new LocationListRsp(dtos);
  }

  @Override
  public LocationDto updateLocaton(UpdateLocationRq rq) {

    var location =
        locationRepository
            .findByName(rq.getOldName())
            .orElseThrow(() -> new LocationNameNotFoundException(rq.getOldName()));

    location.setLocationName(rq.getLocation().getLocationName());
    location.setComment(rq.getLocation().getComment());

    locationRepository.updateByName(rq.getOldName(), location);
    return new LocationDto(location.getLocationName(), location.getLocationName());
  }

  @Override
  public LocationDto deleteLocaton(DeleteLocationRq rq) {

    var location =
        locationRepository
            .findByName(rq.getLocationName())
            .orElseThrow(() -> new LocationNameNotFoundException(rq.getLocationName()));

    locationRepository.removeByName(rq.getLocationName());

    return new LocationDto(location.getLocationName(), location.getLocationName());
  }

  @Override
  public LocationDto createLocaton(CreateLocationRq rq) {

    LocationDto dto = rq.getLocation();
    var loc_name = rq.getLocation().getLocationName();

    if (locationRepository.findByName(loc_name).isPresent())
      throw new LocationNameDublicateException(loc_name);

    var location = new Location(dto.getLocationName(), dto.getComment());

    locationRepository.save(location);

    return dto;
  }
}
