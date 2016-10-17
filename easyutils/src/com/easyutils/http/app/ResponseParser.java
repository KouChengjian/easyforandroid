package com.easyutils.http.app;


import java.lang.reflect.Type;

import com.easyutils.http.request.UriRequest;

/**
 * {@link org.xutils.http.annotation.HttpResponse} 注解的返回值转换模板
 */
public interface ResponseParser {

    /**
     * 检查请求相应头等处理
     *
     * @param request
     * @throws Throwable
     */
    void checkResponse(UriRequest request) throws Throwable;

    /**
     * 转换result为resultType类型的对象
     *
     * @param resultType  返回值类型(可能带有泛型信息)
     * @param resultClass 返回值类型
     * @param result      字符串数据
     * @return
     * @throws Throwable
     */
    Object parse(Type resultType, Class<?> resultClass, String result) throws Throwable;
}
