package dev.fizlrock.waterwalk.infrastructure;

import dev.fizlrock.waterwalk.application.port.ILocationRepository;
import org.springframework.stereotype.Repository;

/** MongoLocationRepository */
@Repository
public interface MongoLocationRepository extends ILocationRepository {}
