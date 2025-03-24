package dev.fizlrock.waterwalk.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/** RepositoryConfig */
@Configuration
@EnableMongoRepositories(basePackages = "dev.fizlrock.waterwalk.infrastructure")
public class RepositoryConfig {}
