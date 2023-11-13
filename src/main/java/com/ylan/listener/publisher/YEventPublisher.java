package com.ylan.listener.publisher;

import com.ylan.listener.event.YPersonSaveEvent;
import com.ylan.listener.event.YPersonUpdateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 14:35
 * @description 事件发布者
 */

@Slf4j
@Component
public class YEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishPersonSaveEvent(){
        YPersonSaveEvent saveEvent = new YPersonSaveEvent(this,1,"wyl",18);
        applicationEventPublisher.publishEvent(saveEvent);
    }

    public void publishPersonUpdateEvent(){
        YPersonUpdateEvent updateEvent = new YPersonUpdateEvent(this,1,"wyl",20);
        applicationEventPublisher.publishEvent(updateEvent);
    }

    public void publishTwoPersonSaveEvent(){
        YPersonSaveEvent saveEvent1 = new YPersonSaveEvent(this,1,"wyl",18);
        applicationEventPublisher.publishEvent(saveEvent1);
        YPersonSaveEvent saveEvent2 = new YPersonSaveEvent(this,2,"wyl",18);
        applicationEventPublisher.publishEvent(saveEvent2);
    }


}