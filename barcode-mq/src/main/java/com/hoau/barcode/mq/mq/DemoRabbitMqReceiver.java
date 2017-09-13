package com.hoau.barcode.mq.mq;

import com.hoau.barcode.mq.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class DemoRabbitMqReceiver {

//    @RabbitListener(queues = "com.hoau.test.mq")
    public void process(User user) {
        System.out.println("Receiver user : " + user.toString());
    }

}
