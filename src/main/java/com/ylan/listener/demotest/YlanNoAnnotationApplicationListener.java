package com.ylan.listener.demotest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2023-11-12 20:56
 */

@Slf4j
@Component
public class YlanNoAnnotationApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("[YlanNoAnnotationApplicationListener]事件触发:{}", event.getClass().getName());
    }
}