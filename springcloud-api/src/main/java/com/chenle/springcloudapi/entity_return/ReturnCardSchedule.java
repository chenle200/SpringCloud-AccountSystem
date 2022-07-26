package com.chenle.springcloudapi.entity_return;
//退卡明细表

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReturnCardSchedule {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String jiaoyiliushuihao;
    private int jiaoyileixingInt;//处理成String
    private String jiaoyileixingString;
    private String kahao;
    private String fakajigou;
    private int piaokaleixingInt;//处理成String
    private String piaokaleixingString;
    private String tuikashijian;
    private float yajin;
    private float yue;
    private float tuikuanjine;
    private String tuikadian;
    private String caozuoyuna;
}
