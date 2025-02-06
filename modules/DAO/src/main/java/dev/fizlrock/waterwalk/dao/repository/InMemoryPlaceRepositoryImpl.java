package dev.fizlrock.waterwalk.dao.repository;

import dev.fizlrock.waterwalk.domain.entity.Place;
import dev.fizlrock.waterwalk.domain.repository.PlaceRepository;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryPlaceRepositoryImpl implements PlaceRepository {

  Map<String, Place> places_map = new HashMap<>();

  @PostConstruct
  void init() {
    var places =
        List.of(
            new Place(
                "Южный мост", "Современный мост через реку Самара, популярное место для прогулок."),
            new Place(
                "Сокский карьер",
                "Живописный карьер с бирюзовой водой, идеален для отдыха и фото."),
            new Place("Полевой спуск", "Уютный спуск к Волге, окруженный зеленью и тишиной."),
            new Place(
                "Спуск на Советской армии", "Один из старейших спусков к реке с видом на город."));
    places.forEach(p -> places_map.put(p.getName(), p));
  }

  @Override
  public boolean containsPlaceWithName(String name) {
    return places_map.containsKey(name);
  }

  @Override
  public void insert(Place p) {
    places_map.put(p.getName(), p);
  }

  @Override
  public Optional<Place> findByName(String name) {
    return Optional.ofNullable(places_map.get(name));
  }

  @Override
  public void removeByName(String name) {
    places_map.remove(name);
  }

  @Override
  public boolean hasRoutesWithName(String name) {
    return false;
  }

  @Override
  public void updateByName(String place_name, Place p) {
    places_map.put(place_name, p);
  }

  @Override
  public List<Place> findAll(int skip, int limit) {
    var places = places_map.values();
    return List.copyOf(places).subList(skip, Math.min(skip + limit, places.size()));
  }
}
