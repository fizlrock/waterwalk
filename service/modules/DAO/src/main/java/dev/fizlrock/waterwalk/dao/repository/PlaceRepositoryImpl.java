package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.dao.jdbc.PlaceEntityRepository;
import dev.fizlrock.waterwalk.dao.mapper.PlaceMapper;
import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.domain.repository.PlaceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaceRepositoryImpl implements PlaceRepository {

  @Autowired PlaceEntityRepository placeRepJdbc;
  @Autowired PlaceMapper mapper;

  @Override
  public boolean containsPlaceWithName(String name) {
    return placeRepJdbc.findByName(name).isPresent();
  }

  @Override
  public void insert(Place p) {

    placeRepJdbc.save(mapper.toEntity(p));
  }

  @Override
  public Optional<Place> findByName(String name) {
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
  public void updateByName(String place_name, Place p) {
    var id = placeRepJdbc.findByName(place_name).orElseThrow().getId();

    var updated = mapper.toEntity(p);
    updated.setId(id);
    placeRepJdbc.save(updated);
  }

  @Override
  public List<Place> findAll(int skip, int limit) {
    // TODO pagination
    return placeRepJdbc.findAll().stream().skip(skip).limit(limit).map(mapper::toDomain).toList();
  }
}
