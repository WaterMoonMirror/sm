package com.example.smd.mail.repository;

import com.example.smd.mail.domain.MailDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<MailDo,Integer> {
}
