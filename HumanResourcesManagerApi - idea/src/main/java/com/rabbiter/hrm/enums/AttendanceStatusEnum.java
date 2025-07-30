package com.rabbiter.hrm.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.poi.ss.formula.functions.T;

/**
 * @Author
 * @Date 2024/3/31
 * @Version 1.0
 */

public enum AttendanceStatusEnum implements BaseEnum<T> {

    NORMAL(0, "正常","success"),
    LATE(1, "迟到",""),
    LEAVE_EARLY(2, "早退","warning"),
    ABSENTEEISM(3, "旷工","danger"),
    LEAVE(4, "休假","info");

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

    AttendanceStatusEnum(Integer code, String message, String tagType) {
        this.code = code;
        this.message = message;
        this.tagType = tagType;
    }
}
