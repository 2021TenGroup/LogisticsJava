package com.logistics.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrdersAll {
    private String sender;

    private String senderPhone;

    private String postcode;

    private String province;

    private String city;

    private String region;

    private String mailingAddress;

    private String addressee;

    private String aPhone;

    private String receivingCode;

    private String receivingAddress;
    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;
}
