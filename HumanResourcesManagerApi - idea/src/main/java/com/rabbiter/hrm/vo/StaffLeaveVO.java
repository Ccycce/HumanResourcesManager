package com.rabbiter.hrm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbiter.hrm.enums.AuditStatusEnum;
import com.rabbiter.hrm.enums.LeaveEnum;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Author
 * @Date 2024/4/5
 * @Version 1.0
 */

public class StaffLeaveVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("工号")
    private String code;

    @ApiModelProperty("员工姓名")
    private String name;

    @ApiModelProperty("部门")
    private String deptName;

    @ApiModelProperty("电话")
    private String phone;


    @ApiModelProperty("员工id")
    private Integer staffId;

    @ApiModelProperty("请假的天数")
    private Integer days;

    @ApiModelProperty("请假类型")
    private LeaveEnum typeNum;

    @ApiModelProperty("请假的起始日期")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

    @ApiModelProperty("0未审核，1审核通过，2驳回，3撤销")
    private AuditStatusEnum status;

    private String remark;

    @Override
    public String toString() {
        return "StaffLeaveVO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", phone='" + phone + '\'' +
                ", staffId=" + staffId +
                ", days=" + days +
                ", typeNum=" + typeNum +
                ", startDate=" + startDate +
                ", createTime=" + createTime +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public LeaveEnum getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(LeaveEnum typeNum) {
        this.typeNum = typeNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public AuditStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AuditStatusEnum status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public StaffLeaveVO() {
    }

    public StaffLeaveVO(Integer id, String code, String name, String deptName, String phone, Integer staffId, Integer days, LeaveEnum typeNum, Date startDate, Timestamp createTime, AuditStatusEnum status, String remark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.deptName = deptName;
        this.phone = phone;
        this.staffId = staffId;
        this.days = days;
        this.typeNum = typeNum;
        this.startDate = startDate;
        this.createTime = createTime;
        this.status = status;
        this.remark = remark;
    }
}
