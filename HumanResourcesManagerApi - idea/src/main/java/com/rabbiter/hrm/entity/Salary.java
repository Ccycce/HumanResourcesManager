package com.rabbiter.hrm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * <p>
 *
 * </p>
 *
 * @Author
 * @since 2024-04-06
 */
@TableName("sal_salary")
@ApiModel(value = "Salary对象", description = "")
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("员工id")
    @TableField("staff_id")
    private Integer staffId;

    @ApiModelProperty("基础工资")
    @TableField("base_salary")
    private BigDecimal baseSalary;

    @ApiModelProperty("加班费")
    @TableField("overtime_salary")
    private BigDecimal overtimeSalary;

    @ApiModelProperty("生活补贴")
    @TableField("subsidy")
    private BigDecimal subsidy;

    @ApiModelProperty("奖金")
    @TableField("bonus")
    private BigDecimal bonus;

    @ApiModelProperty("月份")
    @TableField("month")
    private String month;

    @ApiModelProperty("早退扣款")
    @TableField("late_deduct")
    private BigDecimal lateDeduct;

    @ApiModelProperty("休假扣款")
    @TableField("leave_deduct")
    private BigDecimal leaveDeduct;

    @ApiModelProperty("早退扣款")
    @TableField("leave_early_deduct")
    private BigDecimal leaveEarlyDeduct;

    @ApiModelProperty("旷工扣款")
    @TableField("absenteeism_deduct")
    private BigDecimal absenteeismDeduct;

    @ApiModelProperty("总工资")
    @TableField("total_salary")
        private BigDecimal totalSalary;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

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

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getOvertimeSalary() {
        return overtimeSalary;
    }

    public void setOvertimeSalary(BigDecimal overtimeSalary) {
        this.overtimeSalary = overtimeSalary;
    }

    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getLateDeduct() {
        return lateDeduct;
    }

    public void setLateDeduct(BigDecimal lateDeduct) {
        this.lateDeduct = lateDeduct;
    }

    public BigDecimal getLeaveDeduct() {
        return leaveDeduct;
    }

    public void setLeaveDeduct(BigDecimal leaveDeduct) {
        this.leaveDeduct = leaveDeduct;
    }

    public BigDecimal getLeaveEarlyDeduct() {
        return leaveEarlyDeduct;
    }

    public void setLeaveEarlyDeduct(BigDecimal leaveEarlyDeduct) {
        this.leaveEarlyDeduct = leaveEarlyDeduct;
    }

    public BigDecimal getAbsenteeismDeduct() {
        return absenteeismDeduct;
    }

    public void setAbsenteeismDeduct(BigDecimal absenteeismDeduct) {
        this.absenteeismDeduct = absenteeismDeduct;
    }

    public BigDecimal getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary) {
        this.totalSalary = totalSalary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
