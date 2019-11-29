package com.baxianguohai.hetaodamai.service.service;


import com.baxianguohai.hetaodamai.entity.bo.LogBo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface LogService {
    @RequestMapping(value = "/save/log")
    void save(@RequestBody LogBo logBo);
}
