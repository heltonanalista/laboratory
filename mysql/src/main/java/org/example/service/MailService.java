package org.example.service;

import org.example.entity.Mail;
import org.example.repository.MailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    public MailRepo mailRepo;

    public void saveMail(Mail mail) {
        mailRepo.save(mail);

    }
}