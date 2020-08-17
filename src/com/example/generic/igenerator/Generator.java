package com.example.generic.igenerator;

/**
 * 生成器
 * @author Zzwen
 * @date 2020-7-21 11:29
 */
public interface Generator<T> {

    /**
     * 生成一个T对象
     * @return
     */
    T next();

}
