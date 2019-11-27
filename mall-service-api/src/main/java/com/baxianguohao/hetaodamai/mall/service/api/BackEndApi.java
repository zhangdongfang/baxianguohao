package com.baxianguohao.hetaodamai.mall.service.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface BackEndApi {

    @RequestMapping(value = "/save/log")
    String saveLog();
}
