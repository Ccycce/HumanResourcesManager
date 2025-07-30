package com.rabbiter.hrm.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.poi.ss.formula.functions.T;

/**
 * 休假枚举类
 */

public enum LeaveEnum implements BaseEnum<T> {
    PERSONAL_LEAVE(0, "事假"),
    MATERNITY_LEAVE(1, "产假"),
    SICK_LEAVE(2, "病假"),
    MARRIAGE_LEAVE(3, "婚假"),
    HOME_LEAVE(4, "探亲假"),
    PATERNITY_LEAVE(5, "陪产假");

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String message;

    LeaveEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
