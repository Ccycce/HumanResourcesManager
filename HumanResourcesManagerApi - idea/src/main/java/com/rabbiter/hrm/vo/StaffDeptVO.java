package com.rabbiter.hrm.vo;

import com.rabbiter.hrm.annotation.ExcelColumn;
import com.rabbiter.hrm.enums.GenderEnum;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Date;

/**
 * @Author
 * @Date 2024/4/9
 * @Version 1.0
 */

public class StaffDeptVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("员工id")
    private Integer id;

    @ExcelColumn("工号")
    @ApiModelProperty("员工编码")
    private String code;

    @ExcelColumn("姓名")
    @ApiModelProperty("员工姓名")
    private String name;

    @ExcelColumn("年龄")
    @ApiModelProperty("员工年龄")
    private Integer age;

    @ApiModelProperty("性别，0男，1女，默认0")
    private GenderEnum gender;

    @ExcelColumn("地址")
    @ApiModelProperty("员工家庭住址")
    private String address;

    @ApiModelProperty("部门id")
    private Integer deptId;

    @ExcelColumn("部门")
    @ApiModelProperty("部门")
    private String deptName;

    @ApiModelProperty("员工头像")
    private String avatar;

    @ExcelColumn("生日")
    @ApiModelProperty("员工生日")
    private Date birthday;

    @ExcelColumn("电话")
    @ApiModelProperty("员工电话")
    private String phone;

    @ExcelColumn("备注")
    @ApiModelProperty("员工备注")
    private String remark;


    @ApiModelProperty("员工状态，0异常，1正常")
    private Integer status;

    @Override
    public String toString() {
        return "StaffDeptVO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public StaffDeptVO() {
    }

    public StaffDeptVO(Integer id, String code, String name, Integer age, GenderEnum gender, String address, Integer deptId, String deptName, String avatar, Date birthday, String phone, String remark, Integer status) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.deptId = deptId;
        this.deptName = deptName;
        this.avatar = avatar;
        this.birthday = birthday;
        this.phone = phone;
        this.remark = remark;
        this.status = status;
    }
}
