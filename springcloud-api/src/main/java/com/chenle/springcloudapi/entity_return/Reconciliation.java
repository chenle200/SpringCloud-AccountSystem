package com.chenle.springcloudapi.entity_return;
//对账异常表
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reconciliation {
    private static final long serialVersionUID = 1L;

    private int xuhao;
    private String shuanghudingdanhao;
    private String jiaoyishijian;

    private int yzhifufangshiInt;
    private String yzhifufangshiString;
    private int yzhifuzhuangtaiInt;
    private String yzhifuzhuangtaitring;
    private float yzhongjine;
    private String ytuikuanshangjiadindanhao;
    private int ytuikuanzhuantaiInt;
    private String ytuikuanzhuantaiString;

    private int xzhifufangshiInt;
    private String xzhifufangshiString;
    private int xzhifuzhuangtaiInt;
    private String xzhifuzhuangtaitring;
    private float xzhongjine;

    private float jiaoyijie;
    private String jiaoyiliushuihao;


}
