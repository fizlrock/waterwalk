package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.dao.entity.LocationEntity;
import dev.fizlrock.waterwalk.dao.jdbc.LocationEntityRepository;
import dev.fizlrock.waterwalk.dao.mapper.LocationMapper;
import dev.fizlrock.waterwalk.domain.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class LocationRepository implements ILocationRepository {

    private final LocationEntityRepository locationEntityRepository;
    private final LocationMapper locationMapper;

    @Autowired
    public LocationRepository(LocationEntityRepository locationEntityRepository, LocationMapper locationMapper) {
        this.locationEntityRepository = locationEntityRepository;
        this.locationMapper = locationMapper;
    }

    @Override
    public boolean containsLocationWithName(String name) {
        return locationEntityRepository.findByName(name).isPresent();
    }

    @Override
    public void insert(Location p) {
        LocationEntity entity = locationMapper.toEntity(p);
        locationEntityRepository.save(entity);
    }

    @Override
    public Optional<Location> findByName(String name) {
        return locationEntityRepository.findByName(name)
                .map(locationMapper::toDomain);
    }

    @Override
    public void removeByName(String name) {
        locationEntityRepository.deleteByName(name);
    }

    @Override
    public void updateByName(String place_name, Location p) {
        locationEntityRepository.findByName(place_name)
                .ifPresent(entity -> {
                    entity.setName(p.getLocationName());
                    entity.setDescription(p.getComment());
                    locationEntityRepository.save(entity);
                });
    }

    @Override
    public List<Location> findAll(int skip, int limit) {
        return locationEntityRepository.findAll(PageRequest.of(skip / limit, limit))
                .stream()
                .map(locationMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void save(Location place) {
        LocationEntity entity = locationMapper.toEntity(place);
        locationEntityRepository.save(entity);
    }
}
