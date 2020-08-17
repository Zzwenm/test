package com.example.domain;

public class B extends A{
    static {
        System.out.println("static B");
    }
    public B(){
        System.out.println("构造B");
    }
}
