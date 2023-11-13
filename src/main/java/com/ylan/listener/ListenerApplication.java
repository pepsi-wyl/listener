package com.ylan.listener;

import com.ylan.listener.publisher.YEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ListenerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ListenerApplication.class, args);
        YEventPublisher bean = applicationContext.getBean(YEventPublisher.class);
//        bean.publishPersonSaveEvent();
//        bean.publishPersonUpdateEvent();
//        bean.publishTwoPersonSaveEvent();
    }
}