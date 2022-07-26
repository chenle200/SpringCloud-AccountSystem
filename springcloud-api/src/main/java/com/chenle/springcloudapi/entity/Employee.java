package com.chenle.springcloudapi.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;//身份证

    private Integer status;

}