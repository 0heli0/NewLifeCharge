/* -------------------------------------------
 * UserNewLifeSpendLogChargeOut.java
 * Copyright(C) 2016-2020 咪师教育科技有限公司
 * All rights reserved.
 * 2018-01-23 Created
 * ------------------------------------------- */


package com.newlife.charge.core.dto.out;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.newlife.charge.core.enums.NewLifeSpendLogTypeEnum;
import com.newlife.charge.core.enums.PayTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 车主端 用户充电消费详情
 */
@Getter
@Setter
@ApiModel
public class UserNewLifeSpendLogChargeOut {

    //资金流水记录id
    @ApiModelProperty(value = "资金流水记录id")
    private Integer id;

    //资金流水号
    @ApiModelProperty(value = "资金流水号")
    private String moneySn;

    //类型
    @ApiModelProperty(value = "类型")
    private Integer type;

    //类型中文名称
    @ApiModelProperty(value = "类型中文名称")
    private String typeName;

    //操作金额/消费金额
    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    //用户历史余额/之前剩余金额
    @ApiModelProperty(value = "用户历史余额/之前剩余金额")
    private BigDecimal userOldBalance;

    //用户当前余额/剩余金额
    @ApiModelProperty(value = "用户当前余额/剩余金额")
    private BigDecimal userNowBalance;

    //优惠券减免金额
    @ApiModelProperty(value = "优惠券减免金额")
    private BigDecimal couponPrice;

    //实付金额
    @ApiModelProperty(value = "实付金额")
    private BigDecimal priceReal;

    //支付方式
    @ApiModelProperty(value = "支付方式编码")
    private Integer payType;

    //支付方式
    @ApiModelProperty(value = "支付方式")
    private String payTypeName;

    //桩站ID
    @ApiModelProperty(value = "桩站ID")
    private Integer stationId;

    //桩站名称
    @ApiModelProperty(value = "桩站名称")
    private String stationName;

    //充电方式代码
    @ApiModelProperty(value = "充电方式代码")
    private Integer clientChargeType;

    //充电方式名称
    @ApiModelProperty(value = "充电方式")
    private String clientChargeTypeName;

    //充电时长
    @ApiModelProperty(value = "充电时长")
    private String chargingTime;

    //涉及到的阶段电价，本次充电过程涉及到的各阶段电价（比如：0.5000、0.6523、0.7600、0.4320）
    @ApiModelProperty(value = "电价")
    private String chargePrices;

    //实际充电度数/充入电量
    @ApiModelProperty(value = "实际充电度数/充入电量")
    private BigDecimal degreeReal;

    //充电枪编号
    @ApiModelProperty(value = "充电枪编号")
    private String stationClientGunCode;

    //车位编号
    @ApiModelProperty(value = "车位编号")
    private String stationParkingLotCode;

    //充电桩编号
    @ApiModelProperty(value = "充电桩编号")
    private String stationClientCode;

    //创建时间
    @ApiModelProperty(value = "时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy年MM月dd日HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty(value = "时间戳")
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date createTimestamp;

    //类型备注
    @ApiModelProperty(value = "类型备注")
    private Integer typeRemark;

    //服务费价格
    @ApiModelProperty(value = "服务费价格")
    private BigDecimal servicePrice;

    //充电开始时间
    @ApiModelProperty(value = "充电开始时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy年MM月dd日HH:mm:ss", timezone = "GMT+8")
    private Date beginTime;

    //充电结束时间
    @ApiModelProperty(value = "充电开始时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy年MM月dd日HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    //折扣率(%)
    @ApiModelProperty(value = "折扣率")
    private String rate;

    //用户手机号码
    @ApiModelProperty(value = "用户手机号码")
    private String userMobile;

    public String getTypeName() {
        if(this.type == null ){
            return "";

        }else if(NewLifeSpendLogTypeEnum.USER_RECHARGE.getValue() == type){
            typeName = NewLifeSpendLogTypeEnum.USER_RECHARGE.getDescription();

        }else if(NewLifeSpendLogTypeEnum.CHARGE_CONSUMPTION.getValue() == type){
            typeName = NewLifeSpendLogTypeEnum.CHARGE_CONSUMPTION.getDescription();

        }else if(NewLifeSpendLogTypeEnum.BALANCE_REFUND.getValue() == type){
            typeName = NewLifeSpendLogTypeEnum.BALANCE_REFUND.getDescription();

        }
        return typeName;
    }

    public Date getCreateTimestamp() {
        if(this.createTime != null ){
            this.createTimestamp = this.createTime;
        }
        return createTimestamp;
    }

    public String getPayTypeName() {
        if(this.payType == null) {
            return "";

        }else if(PayTypeEnum.WEIXIN.getValue() == this.payType){
            this.payTypeName = PayTypeEnum.WEIXIN.getDescription();

        }else if(PayTypeEnum.ACCOUNT_BALANCE.getValue() == this.payType){
            this.payTypeName = PayTypeEnum.ACCOUNT_BALANCE.getDescription();

        }else if(PayTypeEnum.ALIPAY.getValue() == this.payType){
            this.payTypeName = PayTypeEnum.ALIPAY.getDescription();

        }
        return payTypeName;
    }
}

