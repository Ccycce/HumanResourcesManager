package com.rabbiter.hrm.vo;

import com.rabbiter.hrm.annotation.ExcelColumn;
import com.rabbiter.hrm.enums.PayStatusEnum;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author
 * @Date 2024/3/23
 * @Version 1.0
 */

public class StaffInsuranceVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("员工id")
    private Integer staffId;

    @ApiModelProperty("城市id")
    private Integer cityId;

    @ApiModelProperty("社保id")
    private Integer insuranceId;

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

    @ExcelColumn("公积金基数")
    @ApiModelProperty("公积金基数")
    private BigDecimal houseBase;

    @ExcelColumn("公积金个人缴纳比例")
    @ApiModelProperty("公积金个人缴纳比例")
    private BigDecimal perHouseRate;

    @ExcelColumn("公积金个人缴纳费用")
    @ApiModelProperty("公积金个人缴纳费用")
    private BigDecimal perHousePay;

    @ExcelColumn("公积金企业缴纳比例")
    @ApiModelProperty("公积金企业缴纳比例")
    private BigDecimal comHouseRate;

    @ExcelColumn("公积金企业缴纳费用")
    @ApiModelProperty("公积金企业缴纳费用")
    private BigDecimal comHousePay;

    @ExcelColumn("公积金备注")
    @ApiModelProperty("公积金备注")
    private String houseRemark;

    @ExcelColumn("社保基数")
    @ApiModelProperty("社保基数")
    private BigDecimal socialBase;

    @ExcelColumn("社保企业缴纳费用")
    @ApiModelProperty("社保企业缴纳费用")
    private BigDecimal comSocialPay;

    @ExcelColumn("社保个人缴纳费用")
    @ApiModelProperty("社保个人缴纳费用")
    private BigDecimal perSocialPay;

    @ExcelColumn("工伤保险企业缴纳比例")
    @ApiModelProperty("工伤保险企业缴纳比例")
    private BigDecimal comInjuryRate;

    @ExcelColumn("社保备注")
    @ApiModelProperty("社保备注")
    private String socialRemark;

    @ApiModelProperty("0未支付，1已支付，2支付失败")
    private PayStatusEnum status;

    @Override
    public String toString() {
        return "StaffInsuranceVO{" +
                "staffId=" + staffId +
                ", cityId=" + cityId +
                ", insuranceId=" + insuranceId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", deptName='" + deptName + '\'' +
                ", houseBase=" + houseBase +
                ", perHouseRate=" + perHouseRate +
                ", perHousePay=" + perHousePay +
                ", comHouseRate=" + comHouseRate +
                ", comHousePay=" + comHousePay +
                ", houseRemark='" + houseRemark + '\'' +
                ", socialBase=" + socialBase +
                ", comSocialPay=" + comSocialPay +
                ", perSocialPay=" + perSocialPay +
                ", comInjuryRate=" + comInjuryRate +
                ", socialRemark='" + socialRemark + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
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

    public PayStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PayStatusEnum status) {
        this.status = status;
    }

    public StaffInsuranceVO() {
    }

    public StaffInsuranceVO(Integer staffId, Integer cityId, Integer insuranceId, String code, String name, String phone, String address, String deptName, BigDecimal houseBase, BigDecimal perHouseRate, BigDecimal perHousePay, BigDecimal comHouseRate, BigDecimal comHousePay, String houseRemark, BigDecimal socialBase, BigDecimal comSocialPay, BigDecimal perSocialPay, BigDecimal comInjuryRate, String socialRemark, PayStatusEnum status) {
        this.staffId = staffId;
        this.cityId = cityId;
        this.insuranceId = insuranceId;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.deptName = deptName;
        this.houseBase = houseBase;
        this.perHouseRate = perHouseRate;
        this.perHousePay = perHousePay;
        this.comHouseRate = comHouseRate;
        this.comHousePay = comHousePay;
        this.houseRemark = houseRemark;
        this.socialBase = socialBase;
        this.comSocialPay = comSocialPay;
        this.perSocialPay = perSocialPay;
        this.comInjuryRate = comInjuryRate;
        this.socialRemark = socialRemark;
        this.status = status;
    }
}
