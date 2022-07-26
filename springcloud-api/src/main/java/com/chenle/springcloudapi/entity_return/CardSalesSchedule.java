package com.chenle.springcloudapi.entity_return;

import lombok.Data;

import java.time.LocalDateTime;

//售卡明细表
@Data
public class CardSalesSchedule {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String jiaoyiliushuihao;
    private int jiaoyileixingInt;//处理成String
    private String jiaoyileixingString;
    private String kahao;
    private String fakajigou;
    private int piaokaleixingInt;//处理成String
    private String piaokaleixingString;
    private String chushoushijian;
    private float yajin;
    private float yue;
    private float youhuijine;
    private String shoukadian;
    private String caozuoyuna;
}
