package com.rabbiter.hrm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Timestamp;
public class StaffDocsVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("文件名称")
    private String name;

    @ApiModelProperty("员工姓名")
    private String staffName;

    @ApiModelProperty("文件类型")
    private String type;

    @ApiModelProperty("文件原名称")
    private String oldName;

    @ApiModelProperty("文件md5信息")
    private String md5;

    @ApiModelProperty("文件大小kB")
    private Long size;

    @ApiModelProperty("文件上传者id")
    private Integer staffId;

    @ApiModelProperty("备注")
    private String remark;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty("创建时间")
    private Timestamp createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty("修改时间")
    private Timestamp updateTime;

    @Override
    public String toString() {
        return "StaffDocsVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", staffName='" + staffName + '\'' +
                ", type='" + type + '\'' +
                ", oldName='" + oldName + '\'' +
                ", md5='" + md5 + '\'' +
                ", size=" + size +
                ", staffId=" + staffId +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
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

    public StaffDocsVO() {
    }

    public StaffDocsVO(Integer id, String name, String staffName, String type, String oldName, String md5, Long size, Integer staffId, String remark, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.name = name;
        this.staffName = staffName;
        this.type = type;
        this.oldName = oldName;
        this.md5 = md5;
        this.size = size;
        this.staffId = staffId;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
