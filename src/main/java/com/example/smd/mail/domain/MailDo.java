package com.example.smd.mail.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "mail")
public class MailDo {
    @Id
    @GeneratedValue
    private int id;
    private String purl;
    private String furl;
    private String name;
}
