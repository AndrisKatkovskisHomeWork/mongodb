package com.sda.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatRepository extends MongoRepository <Cat, Integer> {


}
