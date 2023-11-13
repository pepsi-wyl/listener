package com.ylan.listener.listener;

import com.ylan.listener.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 9:32
 * @description 自定义注解监视器
 * 监听器（listener）具体根据事件发生的业务处理模块，这里可以接收处理事件中封装的对象或字符串。
 */

/**
 * 在方法上使用@EventListener注解，
 */

@Slf4j
@Component
public class MyAnnotationListener {
    @EventListener(classes = {MyEvent.class})
    public void listener(MyEvent event) {
        log.info("[MyAnnotationListener][注解监听器]事件触发:{}", event.getMsg());
    }

    // TransactionalEventListener可以选择在事务完成后才会被执行，事务执行失败就不会被执行。
    @TransactionalEventListener
    public void transactionalListener(MyEvent event) {
        log.info("[transactionalListener][注解监听器]事件触发:{}", event.getMsg());
    }
}