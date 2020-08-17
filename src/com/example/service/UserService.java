package com.example.service;

public class UserService {
    private int count;
    public UserService(){
        count=0;
    }
    public void add(){
        count++;
    }
    public int getCount() {
        return count;
    }
}
