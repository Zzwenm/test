package com.example.cglib.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zzwen
 * @date 2020-8-10 15:06
 */
public class StuHandler<T> implements InvocationHandler {

    /**
     * 被代理对象
     */
    T object;

    public StuHandler(T object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行的方法："+method.getName());
        proxy();
        return method.invoke(object, args);
    }

    private void proxy(){
        System.out.println("代理额外使用的方法");
    }
}
