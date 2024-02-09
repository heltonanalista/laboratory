package org.example.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.example.entity.Message;


public interface MongoRepo extends MongoRepository<Message,String> {
}
