package com.qizhi.mq;

import com.qizhi.mq.service.UserBusinessService;
import com.qizhi.mq.service.impl.UserBusinessServiceImpl;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

/**
 * author:zjprevenge
 * time: 2016/6/30
 * copyright all reserved
 */
public class ProducerTest {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContextProducer.xml");
        context.start();
        UserBusinessService userBusinessService = context.getBean(UserBusinessServiceImpl.class);
        userBusinessService.sendUpdateMessage1(1);
        userBusinessService.sendUpdateMessage2(2);
        userBusinessService.sendUpdateMessage3(3);
        userBusinessService.sendUpdateMessage4(4);
        userBusinessService.sendUpdateMessage5(5);
        userBusinessService.sendUpdateMessage6(6);
        userBusinessService.sendUpdateMessage7(7);
        userBusinessService.sendUpdateMessage8(8);
        userBusinessService.sendUpdateMessage9(9);
        userBusinessService.sendUpdateMessage(10);
    }
}
