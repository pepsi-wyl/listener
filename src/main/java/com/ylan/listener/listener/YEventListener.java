package com.ylan.listener.listener;

import com.ylan.listener.event.YPersonSaveEvent;
import com.ylan.listener.event.YPersonUpdateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2023-11-13 14:39
 * @description 事件监听器
 */

@Slf4j
@Component
public class YEventListener {

    /**
     * 单一事件监听器
     * @param saveEvent
     */
    @EventListener
    public void handleForPersonSaveEvent(YPersonSaveEvent saveEvent){
        log.info("[单一事件监听器] - saveEvent -> {}", saveEvent);
    }

    /**
     * 异步单一事件监听器
     * @param saveEvent
     */
    @Async
    @EventListener
    public void handleForPersonSaveEventAsync(YPersonSaveEvent saveEvent){
        log.info("[单一事件监听器] - saveEventAsync -> {}", saveEvent);
    }

    /**
     * 单一事件监听器
     * @param updateEvent
     */
    @EventListener
    public void handleForPersonUpdateEvent(YPersonUpdateEvent updateEvent){
        log.info("[单一事件监听器] - updateEventAsync -> {}", updateEvent);
    }

    /**
     * 异步单一事件监听器
     * @param saveEvent
     */
    @Async
    @EventListener
    public void handleForPersonUpdateEventAsync(YPersonSaveEvent saveEvent){
        log.info("[单一事件监听器] - saveEvent -> {}", saveEvent);
    }

    /**
     * 使用classes多事件监听器
     * @param event
     */
    @EventListener(classes = {YPersonSaveEvent.class, YPersonUpdateEvent.class})
    public void handleForPersonSaveAndUpdateEvent(Object event){
        log.info("[classes多事件监听器] - multi handle event -> {}", event);
    }

    /**
     * 使用condition筛选监听器
     * @param saveEvent
     */
    @EventListener(condition = "#saveEvent.getId() == 1")
    public void handleByCondition(YPersonSaveEvent saveEvent){
        log.info("[condition筛选监听器] - 只处理id等于1的 -> {}", saveEvent);
    }

    /**
     * 返回单一对象
     *
     * @param saveEvent
     * @return
     */
    @EventListener
    public YPersonUpdateEvent handleHaveOneReturn(YPersonSaveEvent saveEvent){
        log.info("[返回单一对象] - saveEvent -> {}", saveEvent);
        YPersonUpdateEvent updateEvent = new YPersonUpdateEvent(this,1,"wyl",20);
        return updateEvent;
    }

    /**
     * 返回数组集合对象
     *
     * @param saveEvent
     * @return
     */
    @EventListener
    public List<YPersonUpdateEvent> handleHaveListReturn(YPersonSaveEvent saveEvent){
        log.info("[返回集合对象] - save event -> {}", saveEvent);
        List<YPersonUpdateEvent> events = new ArrayList<>();
        events.add(new YPersonUpdateEvent(this,1,"wyl",20));
        events.add(new YPersonUpdateEvent(this,2,"wyl",20));
        return events;
    }

    /**
     * 使用order排序监听器
     * @param saveEvent
     */
    @Order(1)
    @EventListener
    public void handleForPersonSaveEvent1(YPersonSaveEvent saveEvent){
        log.info("[使用order排序监听器] - handle event1 -> {}", saveEvent);
    }

    @Order(2)
    @EventListener
    public void handleForPersonSaveEvent2(YPersonSaveEvent saveEvent){
        log.info("[使用order排序监听器] - handle event2 -> {}", saveEvent);
    }

    @Order(3)
    @EventListener
    public void handleForPersonSaveEvent3(YPersonSaveEvent saveEvent){
        log.info("[使用order排序监听器] - handle event3 -> {}", saveEvent);
    }

}