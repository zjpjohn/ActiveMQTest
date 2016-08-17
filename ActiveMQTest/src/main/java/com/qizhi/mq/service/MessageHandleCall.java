package com.qizhi.mq.service;

/**
 * author:zjprevenge
 * time: 2016/6/30
 * copyright all reserved
 */
public interface MessageHandleCall<T,V> {

    T businessHandle(V param);
}
