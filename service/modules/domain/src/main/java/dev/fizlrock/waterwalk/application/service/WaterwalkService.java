package dev.fizlrock.waterwalk.application.service;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.application.port.IWaterwalkService;
import dev.fizlrock.waterwalk.application.port.dto.CreateLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.DeleteLocationRq;
import dev.fizlrock.waterwalk.application.port.dto.GetLocationListRq;
import dev.fizlrock.waterwalk.application.port.dto.LocationDto;
import dev.fizlrock.waterwalk.application.port.dto.UpdateLocationRq;
import dev.fizlrock.waterwalk.domain.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaterwalkService implements IWaterwalkService {

  @Autowired ILocationRepository locationRepository;

  @Override
  public LocationDto getLocationList(GetLocationListRq rq) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLocationList'");
  }

  @Override
  public LocationDto updateLocaton(UpdateLocationRq rq) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateLocaton'");
  }

  @Override
  public LocationDto deleteLocaton(DeleteLocationRq rq) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteLocaton'");
  }

  @Override
  public LocationDto createLocaton(CreateLocationRq rq) {

    LocationDto dto = rq.getLocation();

    var location = new Location(dto.getLocationName(), dto.getComment());

    locationRepository.save(location);

    return dto;
  }
}
