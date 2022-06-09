package com.whpu.controller;

import com.whpu.pojo.api.GetWhoHasCovidReq;
import com.whpu.pojo.api.GetWhoHasCovidResp;
import com.whpu.service.CovidStatusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 核酸状态信息
 * @author zhoufs
 * @date 2022/6/10
 */

@Api(tags = {"核酸状态信息"})
@RestController
@RequestMapping("/whpu/CovidSearch")
public class CovidStatusController {
    @Autowired
    private CovidStatusService covidStatusService;

    /**
     *查询个人核酸状态
     */
    @RequestMapping(value = "/CovidStatus",method = RequestMethod.POST)
    @ApiOperation(value = "查询核酸状态", notes = "根据个人id查询核酸状态信息")
    public List<GetWhoHasCovidResp> searchStatus(@RequestBody GetWhoHasCovidReq req){
        List<GetWhoHasCovidResp> getWhoHasCovidResp = covidStatusService.searchCovidStatus(req);
        return getWhoHasCovidResp;
    }


}
