package com.ylan.listener.demotest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 9:29
 */

@Slf4j
@Component
public class YlanAnnotationApplicationListener {
    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event) {
        log.info("[YlanAnnotationApplicationListener]事件触发:{}", event.getClass().getName());
    }
}