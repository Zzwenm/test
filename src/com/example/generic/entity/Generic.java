package com.example.generic.entity;

/**
 * @author Zzwen
 * @date 2020-7-21 11:21
 */
public class Generic<T> {

    private T data;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
