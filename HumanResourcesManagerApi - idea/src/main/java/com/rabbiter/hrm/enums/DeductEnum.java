package com.rabbiter.hrm.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.poi.ss.formula.functions.T;

public enum DeductEnum implements BaseEnum<T>{
    LATE_DEDUCT(0, "迟到扣款",50),
    LEAVE_EARLY_DEDUCT(1, "早退扣款",50),
    ABSENTEEISM_DEDUCT(2, "旷工扣款",100),
    LEAVE_DEDUCT(3, "休假扣款",80);


    @EnumValue
    private final Integer code;
    @JsonValue
    private final String message;

    // 默认的扣款金额
    private final Integer defaultValue;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getDefaultValue() {
        return defaultValue;
    }

    DeductEnum(Integer code, String message, Integer defaultValue) {
        this.code = code;
        this.message = message;
        this.defaultValue = defaultValue;
    }
}
