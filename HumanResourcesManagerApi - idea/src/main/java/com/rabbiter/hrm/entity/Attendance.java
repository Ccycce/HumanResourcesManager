package com.rabbiter.hrm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbiter.hrm.annotation.ExcelColumn;
import com.rabbiter.hrm.enums.AttendanceStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Date;

/**
 * <p>
 *
 * </p>
 *
 * @Author
 * @since 2024-03-29
 */
@TableName("att_attendance")
@ApiModel(value = "Attendance对象", description = "")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ExcelColumn("员工id")
    @ApiModelProperty("员工id")
    @TableField("staff_id")
    private Integer staffId;

    @ExcelColumn("上午上班时间")
    @ApiModelProperty("上午上班时间")
    @DateTimeFormat(pattern = "HH:mm")
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    @TableField("mor_start_time")
    private Timestamp morStartTime;

    @ExcelColumn("上午下班时间")
    @ApiModelProperty("上午下班时间")
    @DateTimeFormat(pattern = "HH:mm")
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    @TableField("mor_end_time")
    private Timestamp morEndTime;

    @ExcelColumn("下午上班时间")
    @ApiModelProperty("下午上班时间")
    @DateTimeFormat(pattern = "HH:mm")
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    @TableField("aft_start_time")
    private Timestamp aftStartTime;

    @ExcelColumn("下午下班时间")
    @ApiModelProperty("下午下班时间")
    @DateTimeFormat(pattern = "HH:mm")
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    @TableField("aft_end_time")
    private Timestamp aftEndTime;

    @ExcelColumn("考勤日期")
    @ApiModelProperty("考勤日期")
    @TableField("attendance_date")
    private Date attendanceDate;

    @ApiModelProperty("0正常，1迟到，2早退，3旷工，4休假")
    @TableField("status")
    private AttendanceStatusEnum status;

    @TableField("remark")
    private String remark;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private Timestamp createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private Timestamp updateTime;

    @ApiModelProperty("逻辑删除，0未删除，1删除")
    @TableField("is_deleted")
    @TableLogic
    private Integer deleteFlag;

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", staffId=" + staffId +
                ", morStartTime=" + morStartTime +
                ", morEndTime=" + morEndTime +
                ", aftStartTime=" + aftStartTime +
                ", aftEndTime=" + aftEndTime +
                ", attendanceDate=" + attendanceDate +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

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

    public Timestamp getMorStartTime() {
        return morStartTime;
    }

    public void setMorStartTime(Timestamp morStartTime) {
        this.morStartTime = morStartTime;
    }

    public Timestamp getMorEndTime() {
        return morEndTime;
    }

    public void setMorEndTime(Timestamp morEndTime) {
        this.morEndTime = morEndTime;
    }

    public Timestamp getAftStartTime() {
        return aftStartTime;
    }

    public void setAftStartTime(Timestamp aftStartTime) {
        this.aftStartTime = aftStartTime;
    }

    public Timestamp getAftEndTime() {
        return aftEndTime;
    }

    public void setAftEndTime(Timestamp aftEndTime) {
        this.aftEndTime = aftEndTime;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public AttendanceStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatusEnum status) {
        this.status = status;
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

    public Attendance(Integer id, Integer staffId, Timestamp morStartTime, Timestamp morEndTime, Timestamp aftStartTime, Timestamp aftEndTime, Date attendanceDate, AttendanceStatusEnum status, String remark, Timestamp createTime, Timestamp updateTime, Integer deleteFlag) {
        this.id = id;
        this.staffId = staffId;
        this.morStartTime = morStartTime;
        this.morEndTime = morEndTime;
        this.aftStartTime = aftStartTime;
        this.aftEndTime = aftEndTime;
        this.attendanceDate = attendanceDate;
        this.status = status;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteFlag = deleteFlag;
    }

    public Attendance() {
    }
}
