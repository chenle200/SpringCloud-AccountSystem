package com.chenle.springcloudapi.entity_return;
//充值明细表
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RechargeDetails {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String jiaoyiliushuihao;
    private int jiaoyileixingInt;//处理成String
    private String jiaoyileixingString;
    private String kahao;
    private String fakajigou;
    private int piaokaleixingInt;//处理成String
    private String piaokaleixingString;
    private String chongzhishijian;
    private float chongzhiqianyue;
    private float chongzhijine;
    private float youhuijine;
    private String chongzhidian;
    private String caozuoyuna;


}
