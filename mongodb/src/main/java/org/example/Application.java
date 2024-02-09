package org.example;

import org.example.entity.Message;
import org.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private MessageService messageService;

    @Override
    public void run(String... args) throws Exception {
        Message message=new Message("3","communication", "hello world mongo");
        messageService.saveMessage(message);
    }
}