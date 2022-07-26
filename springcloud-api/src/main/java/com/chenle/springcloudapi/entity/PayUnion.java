package com.chenle.springcloudapi.entity;
import lombok.Data;

@Data
public class PayUnion {
    private static final long serialVersionUID = 1L;

    private String outTradeNo;
    private String voucherNo;
    private int totalFee;
    private String orderType;
    private int orderStatus;
    private String orderMessage;
    private String mchCreate_ip;
    private String clientSn;
    private String body;
    private String attach;
    private String codeUrl;
    private String codeImgUrl;
    private int deleteState;
}
