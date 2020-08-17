package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        int a = ft.get();
        System.out.println(a);
        System.out.println(ft.get());
    }
}
class MyCallable implements Callable<Integer> {
    public Integer call() {
            return 123;
    }
}
