package com.example.staticBean;

import com.example.service.UserService;

public class StaticBeanDemo {

    public static UserService userService = new UserService();

    static {
        System.out.println("静态");
    }

    private StaticBeanDemo(){
        System.out.println("静态类构造函数");
    }
    public static int method1(){
        System.out.println("method1");
        return 1;
    }
    public static int method2(){
        System.out.println("method2");
        return 2;
    }
    public static int method3(){
        System.out.println("method3");
        return 3;
    }
}
