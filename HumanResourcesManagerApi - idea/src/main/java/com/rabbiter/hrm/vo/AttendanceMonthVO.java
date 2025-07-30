package com.rabbiter.hrm.vo;

import com.rabbiter.hrm.annotation.ExcelColumn;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author
 * @Date 2024/4/7
 * @Version 1.0
 */

public class AttendanceMonthVO implements Serializable {


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

    @ExcelColumn("迟到次数")
    private Integer lateTimes;

    @ExcelColumn("早退次数")
    private Integer leaveEarlyTimes;

    @ExcelColumn("旷工次数")
    private Integer absenteeismTimes;

    @ExcelColumn("休假天数")
    private Integer leaveDays;

    @Override
    public String toString() {
        return "AttendanceMonthVO{" +
                "staffId=" + staffId +
                ", deptId=" + deptId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", deptName='" + deptName + '\'' +
                ", lateTimes=" + lateTimes +
                ", leaveEarlyTimes=" + leaveEarlyTimes +
                ", absenteeismTimes=" + absenteeismTimes +
                ", leaveDays=" + leaveDays +
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

    public Integer getLateTimes() {
        return lateTimes;
    }

    public void setLateTimes(Integer lateTimes) {
        this.lateTimes = lateTimes;
    }

    public Integer getLeaveEarlyTimes() {
        return leaveEarlyTimes;
    }

    public void setLeaveEarlyTimes(Integer leaveEarlyTimes) {
        this.leaveEarlyTimes = leaveEarlyTimes;
    }

    public Integer getAbsenteeismTimes() {
        return absenteeismTimes;
    }

    public void setAbsenteeismTimes(Integer absenteeismTimes) {
        this.absenteeismTimes = absenteeismTimes;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public AttendanceMonthVO() {
    }

    public AttendanceMonthVO(Integer staffId, Integer deptId, String code, String name, String phone, String address, String deptName, Integer lateTimes, Integer leaveEarlyTimes, Integer absenteeismTimes, Integer leaveDays) {
        this.staffId = staffId;
        this.deptId = deptId;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.deptName = deptName;
        this.lateTimes = lateTimes;
        this.leaveEarlyTimes = leaveEarlyTimes;
        this.absenteeismTimes = absenteeismTimes;
        this.leaveDays = leaveDays;
    }
}
