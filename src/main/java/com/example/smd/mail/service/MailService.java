package com.example.smd.mail.service;

import com.example.smd.mail.domain.MailDo;
import com.example.smd.mail.vo.MailVo;

import java.util.List;

public interface MailService {

    List<MailVo> getAll();

    void Add(MailVo mailVo);

    void sendMail(MailVo mailVo);
}
