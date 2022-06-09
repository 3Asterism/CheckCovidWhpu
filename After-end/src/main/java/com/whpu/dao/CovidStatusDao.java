package com.whpu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whpu.entity.CovidStatusEntity;
import com.whpu.pojo.api.GetWhoHasCovidResp;
import org.mapstruct.Mapper;
import com.whpu.pojo.api.GetWhoHasCovidReq;

import java.util.List;

/**
 * 核酸信息查询
 * @author zhoufs
 * @date 2022/6/10
 */
@Mapper
public interface CovidStatusDao extends BaseMapper<CovidStatusEntity> {
    //查询本人核酸状态
    List<GetWhoHasCovidReq> searchCovidStatus(GetWhoHasCovidResp getWhoHasCovidResp);

}
