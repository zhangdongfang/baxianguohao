package com.baxianguohai.hetaodamai.manager.impl;

import com.baxianguohai.hetaodamai.biz.manager.LogManager;
import com.baxianguohai.hetaodamai.entity.bo.LogBo;
import org.springframework.stereotype.Component;

/**
 * @author:zdf
 * @date:19-11-29
 */
@Component
public class LogManagerImpl implements LogManager {


    @Override
    public String saveLog(String operationData) {
        LogBo logBo = new LogBo();
        logBo.setOperator("test");
        logBo.setOperationData(operationData);
        logBo.setOperationType("123");
        //return backEndClient.saveLog(logBo);
        return null;
    }
}
