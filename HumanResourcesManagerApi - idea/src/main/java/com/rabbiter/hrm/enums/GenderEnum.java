package com.rabbiter.hrm.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.poi.ss.formula.functions.T;

public enum GenderEnum implements BaseEnum<T>{

    MALE(0,"男"),
    FEMALE(1,"女");

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String message;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    GenderEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
