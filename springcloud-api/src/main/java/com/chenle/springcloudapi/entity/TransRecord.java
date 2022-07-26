package com.chenle.springcloudapi.entity;
import lombok.Data;

@Data
public class TransRecord {
    private static final long serialVersionUID = 1L;

    private String transSn;
    private int dataType;
    private int transType;
    private String ticketType;
    private String cardNo;
    private String cardSn;


    private int transAmount;
    private int balance;
    private int deposit;
    private int discount;
    private int penaltyExcess;


    private String userId;
    private String lineId;
    private String stationId;
    private String last_stationId;
    private String vehicleId;
    private String terminalNo;
    private String terminalSn;
    private String terminalIp;
    private Long terminalTransIndex;
    private int offlineTransType;

    private String offlineTransIndex;
    private String tac;
    private String cityCode;
    private String cardIssuer;
    private String outTradeNo;


}
