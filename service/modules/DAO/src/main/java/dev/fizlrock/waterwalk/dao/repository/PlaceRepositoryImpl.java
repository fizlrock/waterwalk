package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.dao.jdbc.PlaceEntityRepository;
import dev.fizlrock.waterwalk.dao.mapper.PlaceMapper;
import dev.fizlrock.waterwalk.domain.entity.Location;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaceRepositoryImpl implements LocationRepository {

  @Autowired PlaceEntityRepository placeRepJdbc;
  @Autowired PlaceMapper mapper;

  @Override
  public boolean containsLocationWithName(String name) {
    return placeRepJdbc.findByName(name).isPresent();
  }

  @Override
  public void insert(Location p) {

    placeRepJdbc.save(mapper.toEntity(p));
  }

  @Override
  public Optional<Location> findByName(String name) {
    return placeRepJdbc.findByName(name).map(mapper::toDomain);
  }

  @Override
  public void removeByName(String name) {
    placeRepJdbc.deleteByName(name);
  }

  @Override
  public boolean hasRoutesWithName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasRoutesWithName'");
  }

  @Override
  public void updateByName(String place_name, Location p) {
    var id = placeRepJdbc.findByName(place_name).orElseThrow().getId();

    var updated = mapper.toEntity(p);
    updated.setId(id);
    placeRepJdbc.save(updated);
  }

  @Override
  public List<Location> findAll(int skip, int limit) {
    // TODO pagination
    return placeRepJdbc.findAll().stream().skip(skip).limit(limit).map(mapper::toDomain).toList();
  }

  @Override
  public void save(Location place) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }
}
