package com.bjsxt.advice;

import com.bjsxt.pojo.People;
import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-02-07 13:02
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        People users = (People) objects[0];
        Logger logger = Logger.getLogger(MyBeforeAdvice.class);
        logger.info(users.getName()+"在"+new Date().toLocaleString()+"进行登录");
    }
}
