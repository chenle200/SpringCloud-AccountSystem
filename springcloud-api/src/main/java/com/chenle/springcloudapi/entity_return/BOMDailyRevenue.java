package com.chenle.springcloudapi.entity_return;
//BOM营收日报表-现金

import lombok.Data;

@Data
public class BOMDailyRevenue {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String chongzhidian;
    private String shebeibianhao;
    private float heji;

    private int cfashoushu;
    private float cyajin;
    private int cchongzhicishu;
    private float cchongzhijine;
    private int ctuikashu;
    private float ctuikuanyajin;

    private int pfashoushu;
    private float pyajin;
    private int pchongzhicishu;
    private float pchongzhijine;
    private int ptuikashu;
    private float ptuikuanyajin;

    private int xfashoushu;
    private float xyajin;
    private int xchongzhicishu;
    private float xchongzhijine;
    private int xtuikashu;
    private float xtuikuanyajin;

    private int afashoushu;
    private float ayajin;
    private int achongzhicishu;
    private float achongzhijine;
    private int atuikashu;
    private float atuikuanyajin;

    private int jfashoushu;
    private float jyajin;
    private int jchongzhicishu;
    private float jchongzhijine;
    private int jtuikashu;
    private float jtuikuanyajin;
}
