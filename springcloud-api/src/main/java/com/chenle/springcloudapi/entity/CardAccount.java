package com.chenle.springcloudapi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CardAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    private String accountId;
    private String accountType;
    private String accountName;
    private String identityType;
    private String identityNo;
    private String telephone;
    private int accountStatus;
}
