package com.baxianguohai.hetaodamai.service.dao;



import com.baxianguohai.hetaodamai.service.entity.po.LogPo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface LogDao {

    void save(@NotNull @Valid LogPo logPo);

}