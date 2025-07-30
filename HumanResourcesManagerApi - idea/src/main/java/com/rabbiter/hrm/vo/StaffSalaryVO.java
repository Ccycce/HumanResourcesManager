package com.rabbiter.hrm.vo;

import com.rabbiter.hrm.annotation.ExcelColumn;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author
 * @Date 2024/4/8
 * @Version 1.0
 */

public class StaffSalaryVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("员工id")
    private Integer staffId;

    @ApiModelProperty("部门id")
    private Integer deptId;

    @ExcelColumn("员工工号")
    @ApiModelProperty("员工工号")
    private String code;

    @ExcelColumn("员工姓名")
    @ApiModelProperty("员工姓名")
    private String name;

    @ExcelColumn("电话")
    @ApiModelProperty("电话")
    private String phone;

    @ExcelColumn("地址")
    @ApiModelProperty("地址")
    private String address;

    @ExcelColumn("部门")
    @ApiModelProperty("部门")
    private String deptName;

    @ExcelColumn("迟到扣款")
    @ApiModelProperty("迟到扣款")
    private BigDecimal lateDeduct;

    @ExcelColumn("休假扣款")
    @ApiModelProperty("休假扣款")
    private BigDecimal leaveDeduct;

    @ExcelColumn("早退扣款")
    @ApiModelProperty("早退扣款")
    private BigDecimal leaveEarlyDeduct;

    @ExcelColumn("旷工扣款")
    @ApiModelProperty("旷工扣款")
    private BigDecimal absenteeismDeduct;

    @ExcelColumn("公积金缴纳费用")
    @ApiModelProperty("公积金缴纳费用")
    private BigDecimal housePay;

    @ExcelColumn("社保缴纳费用")
    @ApiModelProperty("社保缴纳费用")
    private BigDecimal socialPay;

    @ExcelColumn("基础工资")
    @ApiModelProperty("基础工资")
    private BigDecimal baseSalary;

    @ApiModelProperty("加班费")
    private BigDecimal overtimeSalary;

    @ApiModelProperty("备注")
    private String remark;

    @ExcelColumn("生活补贴")
    @ApiModelProperty("生活补贴")
    private BigDecimal subsidy;

    @ExcelColumn("奖金")
    @ApiModelProperty("奖金")
    private BigDecimal bonus;

    @ApiModelProperty("月份")
    private String month;

    @ExcelColumn("最终工资")
    @ApiModelProperty("最终工资")
    private BigDecimal totalSalary;

    @Override
    public String toString() {
        return "StaffSalaryVO{" +
                "staffId=" + staffId +
                ", deptId=" + deptId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", deptName='" + deptName + '\'' +
                ", lateDeduct=" + lateDeduct +
                ", leaveDeduct=" + leaveDeduct +
                ", leaveEarlyDeduct=" + leaveEarlyDeduct +
                ", absenteeismDeduct=" + absenteeismDeduct +
                ", housePay=" + housePay +
                ", socialPay=" + socialPay +
                ", baseSalary=" + baseSalary +
                ", overtimeSalary=" + overtimeSalary +
                ", remark='" + remark + '\'' +
                ", subsidy=" + subsidy +
                ", bonus=" + bonus +
                ", month='" + month + '\'' +
                ", totalSalary=" + totalSalary +
                '}';
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public BigDecimal getHousePay() {
        return housePay;
    }

    public void setHousePay(BigDecimal housePay) {
        this.housePay = housePay;
    }

    public BigDecimal getSocialPay() {
        return socialPay;
    }

    public void setSocialPay(BigDecimal socialPay) {
        this.socialPay = socialPay;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public BigDecimal getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary) {
        this.totalSalary = totalSalary;
    }

    public StaffSalaryVO() {
    }

    public StaffSalaryVO(Integer staffId, Integer deptId, String code, String name, String phone, String address, String deptName, BigDecimal lateDeduct, BigDecimal leaveDeduct, BigDecimal leaveEarlyDeduct, BigDecimal absenteeismDeduct, BigDecimal housePay, BigDecimal socialPay, BigDecimal baseSalary, BigDecimal overtimeSalary, String remark, BigDecimal subsidy, BigDecimal bonus, String month, BigDecimal totalSalary) {
        this.staffId = staffId;
        this.deptId = deptId;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.deptName = deptName;
        this.lateDeduct = lateDeduct;
        this.leaveDeduct = leaveDeduct;
        this.leaveEarlyDeduct = leaveEarlyDeduct;
        this.absenteeismDeduct = absenteeismDeduct;
        this.housePay = housePay;
        this.socialPay = socialPay;
        this.baseSalary = baseSalary;
        this.overtimeSalary = overtimeSalary;
        this.remark = remark;
        this.subsidy = subsidy;
        this.bonus = bonus;
        this.month = month;
        this.totalSalary = totalSalary;
    }
}
