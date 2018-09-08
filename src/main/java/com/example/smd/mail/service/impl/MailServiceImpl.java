package com.example.smd.mail.service.impl;

import com.example.smd.mail.domain.MailDo;
import com.example.smd.mail.repository.MailRepository;
import com.example.smd.mail.service.MailService;
import com.example.smd.mail.vo.MailVo;
import com.google.common.collect.Lists;
import jodd.mail.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private MailRepository mailRepository;

    @Override
    public List<MailVo> getAll() {
        List<MailDo> all = mailRepository.findAll();
        List<MailVo> voList=Lists.newArrayList();
       all.forEach(mailDo -> {
           MailVo mailVo=new MailVo();
           BeanUtils.copyProperties(mailDo,mailVo);
           voList.add(mailVo);
       });
        return voList;
    }

    @Override
    public void Add(MailVo mailVo) {
        MailDo mailDo=new MailDo();
        BeanUtils.copyProperties(mailVo,mailDo);
        mailRepository.save(mailDo);
    }

    @Override
    public void sendMail(MailVo mailVo) {
        Email email = Email.create()
                .from("lzlj21@163.com")
                .to("lizhu0227@163.com")
                .subject("Hello HTML!")
                .htmlMessage("<b>HTML</b> message");
        SmtpServer smtpServer = MailServer.create()
                .ssl(true)
                .host("smtp.163.com")
                .auth("lzlj21@163.com", "lizhu0227")
                .buildSmtpMailServer();
        SendMailSession session = smtpServer.createSession();
        session.open();
        session.sendMail(email);
        session.close();
    }
}
