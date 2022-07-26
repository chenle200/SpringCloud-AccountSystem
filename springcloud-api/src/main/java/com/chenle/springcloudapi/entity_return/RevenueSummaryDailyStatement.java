package com.chenle.springcloudapi.entity_return;
//营收汇总日报表

import lombok.Data;

import java.time.LocalDate;

@Data
public class RevenueSummaryDailyStatement {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String date;

    private float gshoupiao;
    private float gxiaofei;
    private float gdangrituikuan;
    private float gdaituikuan;

    private float zxianjinyajin;
    private float zxianjincongzhi;
    private float zdianzizhifuyajin;
    private float zdianzizhifucongzhi;


    private float rxianjinyajin;
    private float rxianjincongzhi;
    private float rdianzizhifuyajin;
    private float rdianzizhifucongzhi;
    private float rtuikuanyajin;
    private float rtuikuanjine;

    private float shouchiyanpianjishoupiao;
    private float jinrongPOSji;
    private float gudingerweima;
    private float cezaiqianxiang;
    private float xianjinshouru;
    private float feixianjinshouru;
    private float zongji;

}
