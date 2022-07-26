package com.chenle.springcloudapi.entity_return;
//对账总计表

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReconcileTotals {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String date;

    private float yshourujine;
    private float ytuikuanjine;
    private float yzongjine;
    private int yzongbishu;

    private float xshourujine;
    private float xtuikuanjine;
    private float xzongjine;
    private int xzongbishu;
}
