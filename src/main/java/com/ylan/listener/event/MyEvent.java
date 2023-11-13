package com.ylan.listener.event;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 9:10
 * @description 自定义事件
 * 事件（event）可以封装和传递监听器中要处理的参数，如对象或字符串，并作为监听器中监听的目标。
 */

/**
 * 需要继承ApplicationEvent
 */

@Getter
@Setter
@ToString
public class MyEvent extends ApplicationEvent {

    private String msg ;

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}