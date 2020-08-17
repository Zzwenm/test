package com.example.cglib.entity;

/**
 * 用于测试cglib写的类
 * 对比jdk的代理
 * @author Zzwen
 * @date 2020-8-10 15:42
 */
public class CglibEntity {

    private String name;

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        System.out.println("test2");
    }

}
