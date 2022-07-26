package com.chenle.springcloudapi.entity_return;
//刷卡交易明细表

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SwipeTransactionSchedule {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String jiaoyiliushuihao;
    private String kahao;
    private String fakajigou;
    private int piaokaleixingInt;//转字符串
    private String piaokaleixingString;
    private String jiaoyishijian;
    private int jiaoyileixingInt;//
    private String jiaoyileixingString;
    private float jiaoyiqianjine;
    private float jiaoyijine;
    private float youhuijine;
    private String zongduanjiaoyixulei;
    private String zongduanbianhao;
    private String TAC;

}
