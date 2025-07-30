package com.rabbiter.hrm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbiter.hrm.annotation.ExcelColumn;
import com.rabbiter.hrm.enums.GenderEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * <p>
 *
 * </p>
 *
 * @Author
 * @since 2024-01-27
 */
@TableName("sys_staff")
@ApiModel(value = "Staff对象", description = "")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("员工id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ExcelColumn("工号")
    @ApiModelProperty("员工编码")
    @TableField("code")
    private String code;

    @ExcelColumn("姓名")
    @ApiModelProperty("员工姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("性别，0男，1女，默认男")
    @TableField("gender")
    private GenderEnum gender;

    @ExcelColumn("地址")
    @ApiModelProperty("员工家庭住址")
    @TableField("address")
    private String address;

    @ApiModelProperty("员工密码")
    @TableField("pwd")
    private String password;

    @ApiModelProperty("员工头像")
    @TableField("avatar")
    private String avatar;

    @ExcelColumn("生日")
    @ApiModelProperty("员工生日")
    @TableField("birthday")
    private Date birthday;

    @ExcelColumn("电话")
    @ApiModelProperty("员工电话")
    @TableField("phone")
    private String phone;

    @ExcelColumn("备注")
    @ApiModelProperty("员工备注")
    @TableField("remark")
    private String remark;

    @ExcelColumn("部门id")
    @ApiModelProperty("部门id")
    @TableField("dept_id")
    private Integer deptId;

    @ApiModelProperty("员工状态，0离职，1在职，2禁用")
    @TableField("status")
    private Integer status;

    @ExcelColumn("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Timestamp createTime;

    @ExcelColumn("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateTime;

    @ApiModelProperty("逻辑删除，0未删除，1删除")
    @TableField("is_deleted")
    @TableLogic
    private Integer deleteFlag;

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", remark='" + remark + '\'' +
                ", deptId=" + deptId +
                ", status=" + status +
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Staff(Integer id, String code, String name, GenderEnum gender, String address, String password, String avatar, Date birthday, String phone, String remark, Integer deptId, Integer status, Timestamp createTime, Timestamp updateTime, Integer deleteFlag) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.avatar = avatar;
        this.birthday = birthday;
        this.phone = phone;
        this.remark = remark;
        this.deptId = deptId;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteFlag = deleteFlag;
    }

    public Staff() {
    }
}
