package com.megvii.demo.codes;

import com.megvii.biz.core.annotation.Msg;
import com.megvii.biz.core.codes.impl.AbstractCodes;

public class DemoCodes extends AbstractCodes {

    @Msg("示例错误")
    public final static Integer DEMO_ERROR=9000;
}