package com.ylan.listener.listener;

import com.ylan.listener.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 9:13
 * @description 自定义非注解监视器
 * 监听器（listener）具体根据事件发生的业务处理模块，这里可以接收处理事件中封装的对象或字符串。
 */

/**
 * 需要实现ApplicationListener，
 * 同时泛型参数要加上自己要监听的事件Class名，
 * 在重写的方法onApplicationEvent中，添加自己的业务处理。
 */

@Slf4j
@Component
public class MyNoAnnotationListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info("[MyNoAnnotationListener][非注解监听器]事件触发:{}", event.getMsg());
    }
}