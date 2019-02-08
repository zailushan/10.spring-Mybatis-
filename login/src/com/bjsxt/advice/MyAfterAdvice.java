package com.bjsxt.advice;

import com.bjsxt.pojo.People;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-02-07 13:01
 */
public class MyAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        Logger logger = Logger.getLogger(MyAfterAdvice.class);
        People users = (People) objects[0];
        if(o!=null){
            logger.info(users.getName()+"登录成功!");
        }else{
            logger.info(users.getName()+"登录失败!");
        }
    }
}
