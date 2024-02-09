package org.example.repository;

import org.example.entity.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepo extends JpaRepository <Mail,Long>{
}
