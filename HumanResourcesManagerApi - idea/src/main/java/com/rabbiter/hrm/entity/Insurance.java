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
 * @since 2024-03-24
 */
@TableName("soc_insurance")
@ApiModel(value = "Insurance对象", description = "员工社保")
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("城市id")
    @TableField("city_id")
    private Integer cityId;

    @ApiModelProperty("员工id")
    @TableField("staff_id")
    private Integer staffId;

    @ApiModelProperty("公积金基数")
    @TableField("house_base")
    private BigDecimal houseBase;

    @ApiModelProperty("公积金个人缴纳比例")
    @TableField("per_house_rate")
    private BigDecimal perHouseRate;

    @ApiModelProperty("公积金个人缴纳费用")
    @TableField("per_house_pay")
    private BigDecimal perHousePay;

    @ApiModelProperty("公积金企业缴纳比例")
    @TableField("com_house_rate")
    private BigDecimal comHouseRate;

    @ApiModelProperty("公积金企业缴纳费用")
    @TableField("com_house_pay")
    private BigDecimal comHousePay;

    @ApiModelProperty("公积金备注")
    @TableField("house_remark")
    private String houseRemark;

    @ApiModelProperty("社保基数")
    @TableField("social_base")
    private BigDecimal socialBase;

    @ApiModelProperty("社保企业缴纳费用")
    @TableField("com_social_pay")
    private BigDecimal comSocialPay;

    @ApiModelProperty("社保个人缴纳费用")
    @TableField("per_social_pay")
    private BigDecimal perSocialPay;

    @ApiModelProperty("工伤保险企业缴纳比例")
    @TableField("com_injury_rate")
    private BigDecimal comInjuryRate;

    @ApiModelProperty("社保备注")
    @TableField("social_remark")
    private String socialRemark;

    @ApiModelProperty("0未缴纳，1已缴纳，默认0")
    @TableField("status")
    private Integer status;

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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public BigDecimal getHouseBase() {
        return houseBase;
    }

    public void setHouseBase(BigDecimal houseBase) {
        this.houseBase = houseBase;
    }

    public BigDecimal getPerHouseRate() {
        return perHouseRate;
    }

    public void setPerHouseRate(BigDecimal perHouseRate) {
        this.perHouseRate = perHouseRate;
    }

    public BigDecimal getPerHousePay() {
        return perHousePay;
    }

    public void setPerHousePay(BigDecimal perHousePay) {
        this.perHousePay = perHousePay;
    }

    public BigDecimal getComHouseRate() {
        return comHouseRate;
    }

    public void setComHouseRate(BigDecimal comHouseRate) {
        this.comHouseRate = comHouseRate;
    }

    public BigDecimal getComHousePay() {
        return comHousePay;
    }

    public void setComHousePay(BigDecimal comHousePay) {
        this.comHousePay = comHousePay;
    }

    public String getHouseRemark() {
        return houseRemark;
    }

    public void setHouseRemark(String houseRemark) {
        this.houseRemark = houseRemark;
    }

    public BigDecimal getSocialBase() {
        return socialBase;
    }

    public void setSocialBase(BigDecimal socialBase) {
        this.socialBase = socialBase;
    }

    public BigDecimal getComSocialPay() {
        return comSocialPay;
    }

    public void setComSocialPay(BigDecimal comSocialPay) {
        this.comSocialPay = comSocialPay;
    }

    public BigDecimal getPerSocialPay() {
        return perSocialPay;
    }

    public void setPerSocialPay(BigDecimal perSocialPay) {
        this.perSocialPay = perSocialPay;
    }

    public BigDecimal getComInjuryRate() {
        return comInjuryRate;
    }

    public void setComInjuryRate(BigDecimal comInjuryRate) {
        this.comInjuryRate = comInjuryRate;
    }

    public String getSocialRemark() {
        return socialRemark;
    }

    public void setSocialRemark(String socialRemark) {
        this.socialRemark = socialRemark;
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
}
