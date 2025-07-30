package com.rabbiter.hrm.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.poi.ss.formula.functions.T;

/**
 * @Author
 * @Date 2024/3/23
 * @Version 1.0
 */

public enum PayStatusEnum implements BaseEnum<T> {

    PAY_NO(0, "未支付"),
    PAY_YES(1, "已支付"),
    PAY_FAIl(2, "支付失败");

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

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
