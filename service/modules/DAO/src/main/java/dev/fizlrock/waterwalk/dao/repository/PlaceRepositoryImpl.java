package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.dao.entity.PlaceEntity;
import dev.fizlrock.waterwalk.dao.jdbc.PlaceJdbcRepository;
import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.domain.repository.PlaceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaceRepositoryImpl implements PlaceRepository {

  @Autowired PlaceJdbcRepository placeRepJdbc;

  @Override
  public boolean containsPlaceWithName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'containsPlaceWithName'");
  }

  @Override
  public void insert(Place p) {

    var entity = PlaceEntity.builder().description(p.getComment()).name(p.getName()).build();

    placeRepJdbc.save(entity);
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public Optional<Place> findByName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByName'");
  }

  @Override
  public void removeByName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeByName'");
  }

  @Override
  public boolean hasRoutesWithName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasRoutesWithName'");
  }

  @Override
  public void updateByName(String place_name, Place p) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateByName'");
  }

  @Override
  public List<Place> findAll(int skip, int limit) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }
}
