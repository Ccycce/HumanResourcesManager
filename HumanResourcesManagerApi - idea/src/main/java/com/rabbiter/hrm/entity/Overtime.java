package com.rabbiter.hrm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbiter.hrm.enums.OvertimeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * <p>
 * 加班表
 * </p>
 *
 * @Author
 * @since 2024-03-28
 */
@TableName("att_overtime")
@ApiModel(value = "Overtime对象", description = "加班表")
public class Overtime implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("工资倍数，如按照小时计算，就是员工平均小时工资乘以倍数")
    @TableField("salary_multiple")
    private BigDecimal salaryMultiple;

    @ApiModelProperty("加班奖金")
    @TableField("bonus")
    private BigDecimal bonus;

    @ApiModelProperty("加班类型")
    @TableField("type_num")
    private OvertimeEnum typeNum;

    @ApiModelProperty("部门id")
    @TableField("dept_id")
    private Integer deptId;

    @ApiModelProperty("0小时，1天，默认0，计数加班工资的类型")
    @TableField("count_type")
    private Integer countType;

    @TableField("remark")
    private String remark;

    @ApiModelProperty("0不调休，1调休，默认0")
    @TableField("is_time_off")
    private Integer timeOffFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Timestamp createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateTime;

    @ApiModelProperty("逻辑删除，0未删除，1删除")
    @TableField("is_deleted")
    @TableLogic
    private Integer deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getSalaryMultiple() {
        return salaryMultiple;
    }

    public void setSalaryMultiple(BigDecimal salaryMultiple) {
        this.salaryMultiple = salaryMultiple;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public OvertimeEnum getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(OvertimeEnum typeNum) {
        this.typeNum = typeNum;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getCountType() {
        return countType;
    }

    public void setCountType(Integer countType) {
        this.countType = countType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTimeOffFlag() {
        return timeOffFlag;
    }

    public void setTimeOffFlag(Integer timeOffFlag) {
        this.timeOffFlag = timeOffFlag;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
