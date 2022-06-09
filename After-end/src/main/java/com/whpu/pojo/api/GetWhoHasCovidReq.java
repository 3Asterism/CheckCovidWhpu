package com.whpu.pojo.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("查询核酸状态参数")
public class GetWhoHasCovidReq implements Serializable {

    @ApiModelProperty("请求人id")
    private String personID;
}
