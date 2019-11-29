package com.baxianguohai.hetaodamai.h5.controller;

import com.baxianguohai.hetaodamai.biz.manager.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zdf
 * @date:19-11-27
 */
@RestController
public class FeignClientController {
    @Autowired
    private LogManager logManager;
    //private BackEndClient backEndClient;
    @RequestMapping(value = "/client/save/log")
    public String clientSaveLog(String operationData) {
        String msg = logManager.saveLog(operationData);
        //String msg = backEndClient.saveLog(operationData);
        return msg;
    }
}
