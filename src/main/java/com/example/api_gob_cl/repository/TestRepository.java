package com.example.api_gob_cl.repository;

import com.example.api_gob_cl.models.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "test", path = "test")
public interface TestRepository extends MongoRepository<Test, String> {
}
