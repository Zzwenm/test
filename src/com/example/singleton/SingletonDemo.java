package com.example.singleton;

import com.example.staticBean.StaticBeanDemo;

public class SingletonDemo {

    private static class SingletonDemoHolder{
        private static SingletonDemo singletonDemo = new SingletonDemo();
    }

    public static SingletonDemo getInstance(){
        return SingletonDemoHolder.singletonDemo;
    }

    public static void print(){

    }

}
