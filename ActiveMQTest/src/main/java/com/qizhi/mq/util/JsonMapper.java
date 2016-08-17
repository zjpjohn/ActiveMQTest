package com.qizhi.mq.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * author:zjprevenge
 * time: 2016/6/30
 * copyright all reserved
 */
public class JsonMapper {

    private static ObjectMapper om = new ObjectMapper();

    /**
     * 对象转字符串
     *
     * @param bean
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> String toJson(T bean) throws Exception {
        return om.writeValueAsString(bean);
    }

    /**
     * 字符创转对象
     *
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T toBean(String json, Class<T> clazz) throws Exception {
        return om.readValue(json, clazz);
    }
}
