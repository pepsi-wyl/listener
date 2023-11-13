package com.ylan.listener.api;

import com.ylan.listener.publisher.MyEventPubListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 9:22
 */

@RestController
public class TestEventListenerController {
    @Autowired
    private MyEventPubListener pushListener;

    @RequestMapping(value = "/test/testPublishEvent1" )
    public String testPublishEvent(){
        pushListener.pushListener("我来了！");
        return "OK~";
    }
}