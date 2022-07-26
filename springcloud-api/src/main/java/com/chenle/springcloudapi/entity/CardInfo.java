package com.chenle.springcloudapi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CardInfo {
    private static final long serialVersionUID = 1L;
    private String cardSn;
    private String cardNo;
    private String accountId;
    private String cityCode;
    private String cardIssuer;
    private String ticketType;
    private int deposit;
    private int balance;
    private LocalDateTime updateTime;

    private String updateUser;
    private String terminalNo;
    private String terminalSn;
    private int cardStatus;
}
