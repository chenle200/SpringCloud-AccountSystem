package com.chenle.springcloudapi.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DownloadedBill {
    private static final long serialVersionUID = 1L;
    private int id;
    private String outTradeNo;
    private Date transTime;
    private int totalFee;
    private String orderType;
    private int orderStatus;
    private String clientSn;
    private String outRefundNo;
    private int refundStatus;

}
