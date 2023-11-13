package com.ylan.listener.event;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 14:36
 * @description 人员保存事件
 */

@Getter
@Setter
@ToString
public class YPersonSaveEvent extends ApplicationEvent {

    private int id;
    private String name;
    private int age;

    public YPersonSaveEvent(Object source, int id, String name, int age) {
        super(source);
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
