package com.qizhi.mq;

import com.qizhi.mq.service.UserBusinessService;
import com.qizhi.mq.service.UserService;
import com.qizhi.mq.service.impl.UserBusinessServiceImpl;
import com.qizhi.mq.service.impl.UserServiceImpl;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

/**
 * author:zjprevenge
 * time: 2016/6/30
 * copyright all reserved
 */
public class ProducerTest {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContextProducer.xml");
        context.start();
        final UserBusinessService userBusinessService = context.getBean(UserBusinessServiceImpl.class);
        UserService userService = context.getBean(UserServiceImpl.class);
//        new Thread(new Runnable() {
//            public void run() {
//                userBusinessService.sendUpdateMessage1(1);
//            }
//        }).start();
//        new Thread(new Runnable() {
//            public void run() {
//                userBusinessService.sendUpdateMessage3(2);
//            }
//        }).start();
        userBusinessService.sendUpdateMessage3(3000);
//        userService.selectUserById(12);
//
//        userBusinessService.sendUpdateMessage2(2000);
//        userBusinessService.sendUpdateMessage2(3000);
//        userBusinessService.sendUpdateMessage2(4000);
//        userBusinessService.sendUpdateMessage2(5000);
        userBusinessService.sendUpdateMessage4(4000);
        userBusinessService.sendUpdateMessage5(5000);
        userBusinessService.sendUpdateMessage6(6000);
        userBusinessService.sendUpdateMessage7(7);
        userBusinessService.sendUpdateMessage8(8);
        userBusinessService.sendUpdateMessage9(9);
        userBusinessService.sendUpdateMessage(10);
    }
}
