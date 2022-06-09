package com.whpu.service;

import com.whpu.pojo.api.GetWhoHasCovidReq;
import com.whpu.pojo.api.GetWhoHasCovidResp;

import java.util.List;

/**
 *
 *  与核酸检测状态相关的服务
 *   @author zhoufs
 *   @date 2022/6/10
 */
public interface CovidStatusService {
    List<GetWhoHasCovidResp> searchCovidStatus(GetWhoHasCovidReq req);

}
