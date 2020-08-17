package com.example.thread;

/**
 * Created by Zzwen on 2019/12/3 10:01
 */
public class ThreadTest extends Thread implements Runnable {
    public void run(){
        System.out.println("this is my thread test!");
    }

    public static void main(String[] args) {
        ThreadTest a = new ThreadTest();
        a.run();
    }
}
