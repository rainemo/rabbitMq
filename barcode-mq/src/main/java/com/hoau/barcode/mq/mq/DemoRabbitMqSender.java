package com.hoau.barcode.mq.mq;

import com.hoau.barcode.mq.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@RabbitListener(queues="com.hoau.test.mq")
public class DemoRabbitMqSender {

    public static int age = 18;

    @Autowired
    private AmqpTemplate rabbitTemplate;

//    @Scheduled(fixedDelay=3000)//3s执行1次此方法;
    public void send() {
        age++;
        User user = new User();
        user.setUserName("何羽");
        user.setUserId("299028");
        user.setAge(age);
        System.out.println("send user : " + user.toString());
        this.rabbitTemplate.convertAndSend("com.hoau.test.mq", user.toString());
    }

}
