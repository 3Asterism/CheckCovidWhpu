package com.whpu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *  与核酸检测状态相关数据的信息
 *  与数据库字段一一对应 切记
 *   @author zhoufs
 *
 */

@TableName("COVID_STATUS")
@ApiModel("核酸检测数据信息")
public class CovidStatusEntity implements Serializable {
    private static final long seralVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_UUID,value = "PERSONID")
    @ApiModelProperty("个人ID(主键)")
    private String personID;

    @ApiModelProperty("个人名字")
    private String personName;

    @ApiModelProperty("核酸状态")
    private String covidStatus;

    @ApiModelProperty("进行核酸日期")
    private Date checkingDate;

    @ApiModelProperty("个人权限 0-普通用户 1-核酸检测人员 2-管理员")
    private String powerOfSomeone;

}
