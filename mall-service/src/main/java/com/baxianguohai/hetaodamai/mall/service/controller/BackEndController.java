package com.baxianguohai.hetaodamai.mall.service.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zdf
 * @date:19-11-26
 */
@RestController
class BackEndController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hello spring cloud";
    }
}
