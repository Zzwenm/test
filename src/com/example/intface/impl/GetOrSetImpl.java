package com.example.intface.impl;

import com.example.intface.GetOrSet;

public class GetOrSetImpl implements GetOrSet {
    @Override
    public void get() {
        System.out.println("get");
    }

    @Override
    public void set() {
        System.out.println("set");
    }
}
