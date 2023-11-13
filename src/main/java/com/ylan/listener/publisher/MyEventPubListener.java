package com.ylan.listener.publisher;

import com.ylan.listener.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 9:19
 * @description 自定义发布事件
 * 事件发布者（publisher）事件发生的触发者。
 */

/**
 * 注入ApplicationEventPublisher，这个也就是我们的ApplicationContext
 * 调用publishEvent方法
 */
@Component
public class MyEventPubListener {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * 事件发布方法
     */
    public void pushListener(String msg) {
        applicationEventPublisher.publishEvent(new MyEvent(this, msg));
    }

}