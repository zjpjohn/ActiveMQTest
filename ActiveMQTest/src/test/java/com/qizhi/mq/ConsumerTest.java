package com.qizhi.mq;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

/**
 * author:zjprevenge
 * time: 2016/6/30
 * copyright all reserved
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContextConsumer.xml");
        context.start();
    }
}
