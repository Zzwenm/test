package com.example.generic;

/**
 * @author Zzwen
 * @date 2020-7-21 14:24
 */
public class StaticGeneric<A> {

    A data;

    public static <T> T show(T t){
        System.out.println(t);
        return t;
    }

}
