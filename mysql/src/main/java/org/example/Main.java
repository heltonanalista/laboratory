package org.example;

import org.example.entity.Mail;
import org.example.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Autowired
    private MailService mailService;

    @Override
    public void run(String... args) throws Exception {
        Mail mail = new Mail("communication", "hello world mysql");
        mailService.saveMail(mail);
    }
}