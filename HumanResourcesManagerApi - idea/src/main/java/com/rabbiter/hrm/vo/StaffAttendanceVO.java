package com.rabbiter.hrm.vo;

import com.rabbiter.hrm.annotation.ExcelColumn;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @Author
 * @Date 2024/3/31
 * @Version 1.0
 */

public class StaffAttendanceVO implements Serializable {

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

    @ApiModelProperty("员工考勤数据")
    private List<HashMap<String,Object>> attendanceList;

    @Override
    public String toString() {
        return "StaffAttendanceVO{" +
                "staffId=" + staffId +
                ", deptId=" + deptId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", deptName='" + deptName + '\'' +
                ", attendanceList=" + attendanceList +
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

    public List<HashMap<String, Object>> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<HashMap<String, Object>> attendanceList) {
        this.attendanceList = attendanceList;
    }

    public StaffAttendanceVO() {
    }

    public StaffAttendanceVO(Integer staffId, Integer deptId, String code, String name, String phone, String address, String deptName, List<HashMap<String, Object>> attendanceList) {
        this.staffId = staffId;
        this.deptId = deptId;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.deptName = deptName;
        this.attendanceList = attendanceList;
    }
}
