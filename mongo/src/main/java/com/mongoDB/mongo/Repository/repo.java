package com.mongoDB.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongoDB.mongo.Entity.person;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends MongoRepository<person,String>{
   // person findById(long id);
    person findByName(String name);
}
