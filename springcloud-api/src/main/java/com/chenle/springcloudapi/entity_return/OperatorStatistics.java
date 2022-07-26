package com.chenle.springcloudapi.entity_return;
//操作员统计表
import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorStatistics {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String date;
    private String chongzhidian;
    private String caozuoyuan;

    private int zcishu;
    private float zjine;

    private int scishu;
    private float sjine;

    private int ccishu;
    private float cjine;

    private int tcishu;
    private float tjine;

}
