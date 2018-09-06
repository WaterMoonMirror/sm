package com.example.smd.mail.vo;

import lombok.Data;

import javax.persistence.GeneratedValue;

@Data
public class MailVo {
    private int id;
    private String purl;
    private String furl;
    private String name;
}
