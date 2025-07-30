package com.rabbiter.hrm.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.poi.ss.formula.functions.T;

/**
 * @Author
 * @Date 2024/4/7
 * @Version 1.0
 */

public enum AuditStatusEnum implements BaseEnum<T> {

    UNAUDITED(0, "未审核","info"),
    APPROVE(1, "审核通过","success"),
    REJECT(2, "驳回","danger"),
    CANCEL(3, "撤销","");

    @EnumValue
    private final Integer code;
    @JsonValue
    private final String message;

    private final String tagType;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getTagType() {
        return tagType;
    }

    AuditStatusEnum(Integer code, String message, String tagType) {
        this.code = code;
        this.message = message;
        this.tagType = tagType;
    }
}
