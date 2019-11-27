package com.baxianguohai.hetaodamai.mall.web.client;

import com.baxianguohao.hetaodamai.mall.service.api.BackEndApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "mall-service")
public interface BackEndClient extends BackEndApi {
}
