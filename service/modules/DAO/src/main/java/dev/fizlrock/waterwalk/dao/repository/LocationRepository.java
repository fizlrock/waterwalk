package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import dev.fizlrock.waterwalk.domain.entity.Location;

import java.util.List;
import java.util.Optional;

public class LocationRepository implements ILocationRepository {

    @Override
    public boolean containsLocationWithName(String name) {
        return false;
    }

    @Override
    public void insert(Location p) {

    }

    @Override
    public Optional<Location> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void removeByName(String name) {

    }

    @Override
    public boolean hasRoutesWithName(String name) {
        return false;
    }

    @Override
    public void updateByName(String place_name, Location p) {

    }

    @Override
    public List<Location> findAll(int skip, int limit) {
        return List.of();
    }

    @Override
    public void save(Location place) {

    }
}
