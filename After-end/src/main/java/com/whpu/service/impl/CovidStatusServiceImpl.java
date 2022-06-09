package com.whpu.service.impl;

import com.whpu.pojo.api.GetWhoHasCovidReq;
import com.whpu.pojo.api.GetWhoHasCovidResp;
import com.whpu.service.CovidStatusService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("CovidStatusService")
public class CovidStatusServiceImpl implements CovidStatusService {

    @Override
    public List<GetWhoHasCovidResp> searchCovidStatus(GetWhoHasCovidReq req){
        List<GetWhoHasCovidResp> getWhoHasCovidRespList = new ArrayList<>();
        return getWhoHasCovidRespList;
    }
}
