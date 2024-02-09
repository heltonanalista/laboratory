package org.example.service;

import org.example.entity.Message;
import org.example.repository.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    public MongoRepo mongoRepo;
    public  void saveMessage(Message message){
        mongoRepo.save(message);



    }

}
